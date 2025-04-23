FROM amazoncorretto:17 as builder
WORKDIR /app

# 그래들 래퍼 및 의존성 복사
COPY gradlew .
COPY gradle gradle
COPY build.gradle.kts .
COPY settings.gradle.kts .

# 래퍼 실행 권한 설정
RUN chmod +x ./gradlew

# 의존성 다운로드 캐싱을 위한 초기 빌드 실행
RUN ./gradlew dependencies --no-daemon

# 소스 코드 복사 및 빌드
COPY src src
RUN ./gradlew bootJar --no-daemon

# 실행 단계
FROM amazoncorretto:17
WORKDIR /app
COPY --from=builder /app/build/libs/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]