package com.moyeobwayo.moyeobwayo.Domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class KakaoProfile {

    @Id  // @GeneratedValue(strategy = GenerationType.IDENTITY) 삭제
    private Long kakao_user_id;  // 카카오에서 제공하는 ID를 직접 저장 (Long)

    private String profile_image;
    private String nickname;

    private String access_token;
    private String refresh_token;

    private boolean kakao_message_allow;
    private boolean alarm_off;

    private Long expires_in;  // 액세스 토큰 만료 시간 (초 단위)
    private Long refresh_token_expires_in;  // 리프레시 토큰 만료 시간 (초 단위)
}
