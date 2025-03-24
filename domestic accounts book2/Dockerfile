# 1. ベースイメージを指定（JDK 17を使用）
FROM openjdk:21-jdk-slim

# 2. 作業ディレクトリを作成
WORKDIR /app

# 3. JARファイルをコンテナにコピー
COPY target/*.jar app.jar

# 4. ポートを指定
EXPOSE 8080

# 5. アプリケーションを実行
ENTRYPOINT ["java", "-jar", "app.jar"]