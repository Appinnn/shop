package com.shop.Dto;

import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.ui.Model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
public class MemberForm
{
    private Long id;
    @NotBlank(message="아이디는 필수 입력란 입니다.")
    private String userId;

    @NotBlank(message = "이메일을 작성하셔야 합니다.")
    private String email;

    @Size(min = 4, max = 12, message = "비밀번호는 4자리부터 12자리 사이로 입력하셔야 합니다.")
    private String password;

    private String name;
    private String addr1; // 주소
    private String addr2; // 상세주소
    private int zipCode; // 우편번호

    private static ModelMapper mapper = new ModelMapper();
}
