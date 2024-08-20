package com.example.ojt.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AddCertificateReq {
    @NotNull(message = "Name of certificate must not be empty")
    @NotBlank(message = "Name of certificate must not be empty")
    private String name;
    @NotNull(message = "Name of organization must not be empty")
    @NotBlank(message = "Name of organization must not be empty")
    private String organization;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date startAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endAt;
    @NotNull(message = "Information must not be empty")
    @NotBlank(message = "Information must not be empty")
    private String info;
}
