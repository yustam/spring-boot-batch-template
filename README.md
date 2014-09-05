spring-boot-batch-template
==========================

## 使い方
```bash
$ java -jar spring-boot-batch-sample-0.0.1-SNAPSHOT.jar --db.host=localhost --db.port=5432
```

## テスト用データ
```sql
DROP TABLE IF EXISTS artist;
DROP TABLE IF EXISTS company;

DROP SEQUENCE IF EXISTS artist_id_seq;
DROP SEQUENCE IF EXISTS company_id_seq;

CREATE TABLE company (
  id SERIAL PRIMARY KEY,
  code VARCHAR(3) NOT NULL UNIQUE,
  name VARCHAR(255) NOT NULL
);
INSERT INTO company (code, name) VALUES
  ('001', 'foo label'),('002', 'bar label');

CREATE TABLE artist (
  id SERIAL PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  company_code VARCHAR(6) REFERENCES company(code)
);
INSERT INTO artist (name, company_code) VALUES
  ('hoge band', '001'), ('hoge group', '001'), ('team hoge', '002');
```

## 環境設定
```bash
$ docker run -d -name postgres -p 15432:5432 postgres
$ docker build -t yustam/spring-batch .
$ docker run --link postgres:db yustam/spring-batch
```
