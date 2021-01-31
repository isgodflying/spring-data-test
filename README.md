# spring-data-test
## @DataRedisTest
### 설명
- 도움을 주고자하는 spring의 어노테이션임에도 불구하고 간단한데 처음 적용하려면 괜히 어려운 부분이 있습니다.
- 굉장히 간단하지만 실행되는 프로젝트 공유합니다.

### 방법
- redis 설치
  - redis가 있다면 다음단계로 넘어가셔도 됩니다.
  - 혹시 없으시다면 docker로 redis를 띄워 테스트합니다.
  - 명령어: docker run --name sample-redis -d -p 6379:6379 redis
- 프로젝트 clone
- src > test > java > ... > redis > SpringDataRedisTest 실행
    - redis를 바로 테스트해 볼 수 있습니다.
- src > test > java > ... > redis > SpringDataRedisWithRedisConfigTest 실행
    - redis에 RedisConfig를 추가로 설정하여 테스트해 볼 수 있습니다.

---
- 작업자 블로그: http://silvergoni.tistory.com
