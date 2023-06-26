# spring-auth
스프링 시큐리티 로그인 처리 흐름을 정리해봤습니다.

클라이언트쪽에서 아이디와 비밀번호를 가지고 POST요청을 합니다.

0. 필터체인에서 FilterChainProxy를 통해 UsernamePasswordAuthenticationFilter를 탑니다.

1. UsernamePasswordAuthenticationToken객체를 생성합니다.

2. AuthenticationManager(인증관리자)에게 넘겨 인증을 시도합니다.

3. 인증관리자는 username을 전달하고 UserDetails를 요청합니다.

4. UserDetailsService에서 username을 전달받아 회원DB와 연동해 회원을 조회한다. UserDetailsImpl을 로드합니다.

5. 인증관리자는 UserDetailsImpl과 UsernamePasswordAuthenticationToken 객체와 비교하여 인증을 수행합니다.

6. 인증이 완료되면 SecurityContextHolder안의 SecurityContext안의 Authentication객체로써 유저 정보를 저장합니다.

7. Authentication 객체를 통해 인증된 사용자의 정보를 관리하게 됩니다.
