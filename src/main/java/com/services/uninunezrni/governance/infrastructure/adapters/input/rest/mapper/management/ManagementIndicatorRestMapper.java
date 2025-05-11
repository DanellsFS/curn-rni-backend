package com.services.uninunezrni.governance.infrastructure.adapters.input.rest.mapper.management;

import com.services.uninunezrni.governance.domain.model.management.ManagementIndicator;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.request.management.ManagementIndicatorRequest;
import com.services.uninunezrni.governance.infrastructure.adapters.input.rest.model.response.management.ManagementIndicatorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ManagementIndicatorRestMapper {
    ManagementIndicator toManagementIndicator(ManagementIndicatorRequest request);
    ManagementIndicatorResponse toManagementIndicatorResponse(ManagementIndicator managementIndicator);
    List<ManagementIndicatorResponse> toManagementIndicatorResponseList(List<ManagementIndicator> managementIndicatorList);
}
