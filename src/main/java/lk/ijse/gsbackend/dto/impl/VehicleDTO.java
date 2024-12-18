package lk.ijse.gsbackend.dto.impl;

import lk.ijse.gsbackend.customObj.VehicleResponse;
import lk.ijse.gsbackend.dto.SuperDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class VehicleDTO implements SuperDTO, VehicleResponse {
    private String vehicleCode;
    private String licensePlateNumber;
    private String vehicleCategory;
    private String fuelType;
    private String status;
    private String remark;
    private String allocatedStaffMemberId;
}
