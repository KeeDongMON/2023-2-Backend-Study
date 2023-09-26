## HTTP

**HTTP (HyperText Transfer Protocol)**

- 서로 다른 시스템들 사이에서 통신을 주고 받게 해주는 application 계층의 protocol.
- 웹에서만 사용하는 프로토콜로 TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송.
- Hypertext는 다른 페이지의 링크를 담고 있는 문서를 의미한다.

**HTTP 특징**

- **Transfer layer** : TCP/IP 기반으로 서버와 클라이언트 간의 요청과 응답을 전송한다.
- **비 연결성 (Connectionless)** : 클라이언트와 서버가 연결 후 요청 및 응답을 마친 후 연결을 끊는다.
- **무상태성 (Stateless)** : 서버는 두 요청 간의 데이터를 유지하지 않으며, 클라이언트와의 연결 정보를 저장하지 않는다.

**HTTP 연결**

- 연결 과정: TCP 연결 생성 → HTTP 메시지 전송 → 서버 응답 읽기 → 연결 종료 혹은 재사용.

**HTTP 메시지**

- 데이터 교환 방식으로, 요청(request)와 응답(response)이 있다.
- 요청 구조: HTTP 메서드, 경로, HTTP 버전, 헤더 등으로 구성.

**HTTP 메서드**

- 클라이언트가 서버에 요청을 보낼 때 사용되며, 주로 GET, POST 등의 메서드가 있다.

## HTTPS, HTTP와의 비교

**HTTPS (HyperText Transfer Protocol Secure)**

- HTTP의 보안 확장 버전
- 웹 브라우저와 웹 서버 간의 데이터 통신을 암호화하여 중간자 공격(man-in-the-middle attack) 등의 보안 위협을 최소화
- SSL (Secure Sockets Layer) 또는 그 후속인 TLS (Transport Layer Security) 프로토콜을 사용하여 통신을 암호화

**HTTP와 HTTPS의 주요 차이점**

- **보안** : HTTPS는 SSL/TLS를 사용하여 데이터 통신을 암호화하여 보안성이 높음. HTTP는 암호화되지 않은 평문(plain text)로 데이터를 전송하기 때문에 중간에서 데이터를 가로채기 쉬움.
- **포트 번호** : HTTP는 기본적으로 80번 포트를 사용하고, HTTPS는 443번 포트를 사용
- **속도** : HTTPS는 암호화 및 복호화 과정이 있기 때문에 HTTP에 비해 속도가 약간 느릴 수 있음. 그러나 현대의 기술과 최적화 기법을 사용하면 큰 차이가 없음.
- **인증** : HTTPS는 디지털 인증서를 통해 웹 서버의 신뢰성을 확인.

**이벤트 관련**

- 이벤트 목록 조회: `GET /events`
- 이벤트 조회: `GET /events/{eventId}`
- 이벤트 등록: `POST /events`
- 이벤트 수정: `PUT /events/{eventId}`
- 이벤트 삭제: `DELETE /events/{eventId}`
- 이벤트 상태 변경: `PATCH /events/{eventId}/status`
- 특정 이벤트의 주문 목록 조회: `GET /events/{eventId}/orders`

**멤버 관련**

- 멤버 목록 조회: `GET /members`
- 특정 멤버 권한 변경: `PATCH /members/{memberId}/permissions`
- 특정 멤버 정보 조회: `GET /members/{memberId}`
- 특정 멤버 정보 변경: `PATCH /members/{memberId}`
- 멤버 등록: `PUT /members`
