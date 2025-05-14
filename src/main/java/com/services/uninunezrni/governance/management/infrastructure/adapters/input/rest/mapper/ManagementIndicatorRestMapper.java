package com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.mapper;

import com.services.uninunezrni.governance.management.domain.model.ManagementIndicator;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.request.ManagementIndicatorRequest;
import com.services.uninunezrni.governance.management.infrastructure.adapters.input.rest.model.response.ManagementIndicatorResponse;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ManagementIndicatorRestMapper {
    ManagementIndicator toManagementIndicator(ManagementIndicatorRequest request);
    ManagementIndicatorResponse toManagementIndicatorResponse(ManagementIndicator managementIndicator);
    List<ManagementIndicatorResponse> toManagementIndicatorResponseList(List<ManagementIndicator> managementIndicatorList);
}
