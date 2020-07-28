# SQL & JDBC 프로그래밍

# 1. MySQL

## 1) inrto

### 1. 데이터베이스의 기본 개념 (정의)

- 데이터의 집합 (a Set of Data)
- 여러 응용 시스템(프로그램)들의 통합된 정보들을 저장하여 운영할 수 있는 공용(share) 데이터의 집합
- 효율적으로 저장, 검색, 갱신할 수 있도록 데이터 집합들끼리 연관시키고 조직화되어야 한다.



### 2. 데이터베이스의 특성

- 실시간 접근성(Real-time Accessability)

  : 사용자의 요구를 즉시 처리할 수 있다.

- 계속적인 변화(Continuous Evolution)

  : 정확한 값은 유지하려고 삽입, 삭제, 수정 작업 등을 이용해 데이터를 지속적으로 갱신할 수 있다.

- 동시 공유성(Concurrent Sharing)

  : 사용자마다 서로 다른 목적으로 사용하므로 동시에 여러 사람이 동일한 데이터에 접근하고 이용할 수 있다.

- 내용 참조(Content Reference)

  : 저장한 데이터 레코드의 위치나 주소가 아닌 사용자가 요구하는 데이터의 내용, 즉 데이터 값에 따라 참조할 수 있어야 한다.



### 3. 데이터 베이스 관리 시스템(Database Management System = DBMS)

- 데이터베이스를 관리하는 소프트웨어
- 여러 응용 소프트웨어(프로그램) 또는 시스템이 동시에 데이터베이스에 접근하여 사용할 수 있게 한다.
- 필수 3기능
  - 정의기능 : 데이터 베이스의 논리적, 물리적 구조를 정의
  - 조작기능 : 데이터를 검색, 삭제, 갱신, 삽입하는 기능
  - 제어기능 : 데이터베이스의 내용 정확성과 안전성을 유지하도록 제어하는 기능
- Oracle, SQL Server, MySQL, DB2 등의 상용 또는 공개 DBMS가 있다.



### 4. 데이터 베이스 관리 시스템 장/단점

- 장점
  - 데이터 중복이 최소화
  - 데이터의 일관성 및 무결성 유지
  - 데이터 보안 보장
- 단점
  - 운영비가 비싸다
  - 백업 및 복구에 대한 관리가 복잡
  - 부분적 데이터베이스 손실이 정체 시스템을 정지



### * 참고 자료

[DBMS 참고링크](https://ko.wikipedia.org/wiki/%EB%8D%B0%EC%9D%B4%ED%84%B0%EB%B2%A0%EC%9D%B4%EC%8A%A4_%EA%B4%80%EB%A6%AC_%EC%8B%9C%EC%8A%A4%ED%85%9C)





## 2) MySQL 다운로드 및 설치

### 1. Windows에서 MySQL 설치하기

[MySQL 설치 프로그램 다운로드](https://www.mysql.com/downloads/)

위의 URL 주소로 접속합니다.

![MySQL 설치](./img/1-2-01.png)

접속하면 하단에 위와 같은 링크가 보여집니다.

`Community(GPL) Downloads`를 클릭합니다.

![MySQL 설치](./img/1-2-02.png)

다시 화면이 바뀌고, 하단에서 위와 같은 부분을 찾습니다.

`MySQL Community Server Download` 링크를 클릭합니다.

![MySQL 설치](./img/1-2-03.png)

본인이 사용하는 윈도우에 맞는 버전을 선택합니다.

그리고 나서 `Go to Download Page` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-04.png)

위와 같은 화면으로 전환되면 붉은 사각형으로 처져 있는 `Download` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-05.png)

로그인을 하지 않고 다운로드 하려면 `No thanks, just start my download` 링크를 클릭합니다.

MySQL Community Edition이 이제 다운로드 됩니다.

mysql-installer-community-5.7.21.0.msi를 실행합니다.

![MySQL 설치](./img/1-2-06.png)

설치 프로그램을 실행하면 가장 먼저 라이선스에 대해서 물어보는 화면이 보입니다.

라이선스 동의 체크박스를 선택한 후 `Next` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-07.png)

`Developer Default`를 선택한 후 `Next` 버튼을 클릭합니다.

말 그대로 개발자를 위한 MySQL을 설치하겠다는 것입니다.

개발자를 위한 다양한 도구들이 함께 설치가 됩니다.

![MySQL 설치](./img/1-2-08.png)

위와 같은 화면이 보이면, `Execute` 버튼을 클릭하여 설치를 진행합니다.

![MySQL 설치](./img/1-2-09.png)

MySQL이 설치되고 실행되기 위해서 필요한 도구들에 대해서 `Execute`를 눌러 설치한 후 `Next` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-10.png)

설치할 항목이 표시됩니다.

`Execute` 버튼을 클릭하여 설치를 시작합니다.

![MySQL 설치](./img/1-2-11.png)

설치가 모두 진행되었다면 `Next` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-12.png)

MySQL과 관련된 설정 과정이 진행된다는 안내가 표시됩니다.

`Next` 버튼을 클릭합니다.

root 계정의 암호를 설정하는 부분까지 기본값으로 설치를 진행합니다.

![MySQL 설치](./img/1-2-13.png)

MySQL의 `관리자(root) 계정의 암호`를 설정합니다.

암호를 잊지 않게 조심해 주세요.

암호를 입력했다면 `Next` 버튼을 클릭합니다.

커넥션 연결 테스트를 진행할 때까지 기본값으로 설치를 진행하도록 하겠습니다.

![MySQL 설치](./img/1-2-14.png)

MySQL이 잘 실행되고 있는지 확인하기 위한 화면입니다.

앞에서 입력했던 root 사용자의 암호를 입력하고 `Check` 버튼을 클릭합니다.

위와 같이 연결 성공이라는 녹색화면이 보이면 `Next` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-15.png)

모든 설치 과정이 끝났습니다.

`Finish` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-16.png)

모든 인스톨 과정이 완료되었습니다.

`Finish` 버튼을 클릭하면 MySQL Workbench와 MySQL Shell이 실행될 것이라는 체크박스가 선택되어 있습니다.

`Finish` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-17.png)

MySQL Workbench 실행화면입니다.

![MySQL 설치](./img/1-2-18.png)

MySQL Shell 실행화면입니다.

앞으로 MySQL을 이용해서 개발을 진행할 때 워크벤치나 MySQL 쉘을 이용해야 하는 경우가 많이 발생할 것입니다.

창을 닫고, 프로그램을 종료해주세요.

![MySQL 설치](./img/1-2-19.png)

윈도우 메뉴를 보면 MySQL 그룹이 새로 생긴 것을 볼 수 있습니다.

위의 그림중에서 붉은 상자로 되어 있는 부분이 워크벤치와 MySQL Shell을 실행하기 위한 아이콘입니다.

뒤에서 MySQL을 사용할 때 위의 아이콘을 선택하시면 됩니다.

콘솔창에서 mysql 명령을 실행하려면, 다음의 경로를 PATH에 지정하세요.

윈도우 검색창에 `환경`이라고 입력합니다.

![MySQL 설치](./img/1-2-20.png)

`시스템 환경 변수 편집`이라는 프로그램이 보이면 클릭해서 실행합니다.

![MySQL 설치](./img/1-2-21.png)

위와 같은 시스템 속성창이 열리면 아래 쪽의 `환경 변수` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-22.png)

시스템 변수 중에서 Path를 선택하고, `편집` 버튼을 클릭합니다.

![MySQL 설치](./img/1-2-23.png)

`새로 만들기` 버튼을 클릭한 후, 아래의 path를 입력한 후 `확인` 버튼을 클릭합니다.

이전 창도 모두 `확인` 버튼을 눌러 닫습니다.

`C:\Program Files\MySQL\MySQL Server 5.7\bin`

이제 콘솔창에서 mysql 명령을 수행할 수 있습니다.



### 2. Mac에서 MySQL 설치하기

#### 2.1. HomeBrew 설치하기

먼저 맥에 `HomeBrew`가 설치되어 있어야 합니다.

터미널에서 아래 명령어를 통해 HomeBrew가 설치되어 있는지 확인해볼 수 있습니다.

```shell
brew -v
```

만약 HomeBrew가 기존에 설치된 상태라면 버전 정보를 확인해볼 수 있습니다.

```shell
HomeBrew 1.5.0

HomeBrew/homebrew-core (git revision ce185; last commit 2018-01-20)

```

만약 버전 정보가 제대로 나오지 않는다면 먼저 `HomeBrew` 설치를 먼저 해주세요.

HomeBrew 설치법은 [https://brew.sh](https://brew.sh) 사이트 설명을 참고하시면 됩니다.

설치법이 간단하고 한국어 설명도 지원하기 때문에 쉽게 할 수 있습니다.

#### 2.2. HomeBrew를 이용한 MySQL 설치하기

HomeBrew를 이용하면 쉽게 설치할 수 있고, 환경변수를 설정할 필요도 없습니다.

Oracle사에서 직접 다운로드하여 설치하는 것보다 훨씬 쉽게 설치하고 사용할 수 있습니다.

```shell
brew install mysql
```

위의 문장을 입력하면 다음과 같은 화면이 출력되고 설치가 완료됩니다.

![MySQL 설치](./img/1-2-24.png)



### * 참고 자료

[Installing and Upgrading MySQL](https://dev.mysql.com/doc/refman/5.7/en/installing.html)

[MySQL 8.x 설치하기](https://dog-developers.tistory.com/20)





## 3) MySQL 실행

### 1. MS Windows 10

![MySQL 서버 실행](./img/1-3-01.png)

윈도우 검색 버튼에서 `서비스`라고 입력하면 `서비스(데스크톱 앱)`이라는 프로그램이 보입니다.

해당 프로그램을 선택하세요.

![MySQL 서버 실행](./img/1-3-02.png)

위와 같이 `MySQL57`이라는 이름으로 서비스가 실행된 것을 알 수 있습니다.

참고로 MySQL이 설치될 때 유심히 봤다면 MySQL57이라는 서비스 이름으로 서비스가 실행된다는 메시지가 보입니다.

시작 유형은 자동으로 되어있기 때문에, 윈도우가 실행될 때 자동으로 서버가 서비스 형태로 실행됩니다.

나중에, MySQL이 동작하지 않는다면 해당 서비스에서 `실행 중`이라고 표시되는지 확인해주세요.



### 2. Mac

HomeBrew를 이용해서 MySQL을 설치했다면, 실행과 중지가 상당히 간편합니다.

환경 변수 설정 등이 모두 자동으로 이뤄지기 때문입니다.

#### 2.1. MySQL 서버 실행하기

mysql 서버를 실행하려면 터미널을 실행해 주신 후 아래와 같이 명령을 실행해 주세요.

```shell
mysql.server start
```

위의 명령을 내리면 아래와 같은 메시지가 실행됩니다.

```shell
Starting MySQL
.SUCCESS!
```

#### 2.2. MySQL을 데몬으로 실행하기

운영체제의 백그라운드로 MySQL이 계속 실행되도록 하고 싶다면 `HomeBrew`가 제공하는 명령을 이용하면 됩니다.

`HomeBrew`로 다음과 같이 mysql 데몬을 실행합니다.

아래와 같이 명령을 수행하면 간단하게 mysql을 데몬형태로 실행할 수 있습니다.

```shell
brew services start mysql
```

서비스 재시작도 HomeBrew가 제공하는 명령을 이용하면 됩니다.

아래와 같이 명령을 수행하세요.

```shell
brew services restart mysql
```

데몬으로 실행되고 있는 프로그램들이 궁금하다면 아래와 같이 명령을 실행하면 됩니다.

```shell
brew services list
```



### * 참고 자료

[Installing and Upgrading MySQL](https://dev.mysql.com/doc/refman/5.7/en/installing.html)





## 4) MySQL 종료

### 1. Windows에서 MySQL 서버 종료하기

윈도우에서 MySQL 서버를 종료하는 것은 간단합니다.

![MySQL 서버 종료](./img/1-4-01.png)

서비스 목록에서 `MySQL57`을 선택한 후 우측버튼을 클릭합니다.

우측버튼을 클릭했다면 `속성` 버튼을 클릭합니다.

![MySQL 서버 종료](./img/1-4-02.png)

속성 창에서 `중지` 버튼을 클릭하면 MySQL 서버는 정지됩니다.

만약, 윈도우가 실행될 때 자동으로 실행되길 원하지 않는다면, 시작 유형 `자동`을 `수동`으로 변경한 후 `확인` 버튼을 클릭하면 됩니다.

이 경우에는 위의 유형 창에서 `시작` 버튼을 매번 눌러줘야 MySQL 서버가 실행됩니다.



### 2. Mac에서의 MySQL 종료하기

```shell
mysql.server start
```

터미널에서 위의 명령으로 서버를 실행했다면

```shell
mysql.server stop
```

위의 명령으로 서버를 종료할 수 있습니다.

```shell
Shutting down MySQL

..SUCCESS!
```

MySQL이 종료되면서 위와 같은 메시지가 보여집니다.

만약 `HomeBrew`를 이용해서 다음과 같이 데몬으로 실행했다면

```shell
brew services start mysql
```

다음과 같은 명령으로 데몬 형태로 실행되고 있는 MySQL을 종료할 수 있습니다.

```shell
brew service stop mysql
```



### * 참고 자료

[Installing and Upgrading MySQL](https://dev.mysql.com/doc/refman/5.7/en/installing.html)



# 2. SQL

## 1) SQL이란?

### 1. SQL(Structured Query Language)

- SQL은 데이터를 보다 쉽게 검색하고 추가, 삭제, 수정 같은 조작을 할 수 있도록 고안된 컴퓨터 언어입니다.
- 관계형 데이터베이스에서 데이터를 조작하고 쿼리하는 표준 수단입니다.
- `DML (Data Manipulation Language)` : 데이터를 조작하기 위해 사용합니다.
  INSERT, UPDATE, DELETE, SELECT 등이 여기에 해당합니다.
- `DDL (Data Definition Language)` : 데이터베이스의 스키마를 정의하거나 조작하기 위해 사용합니다.
  CREATE, DROP, ALTER 등이 여기에 해당합니다.
- `DCL (Data Control Language)` : 데이터를 제어하는 언어입니다.
  권한을 관리하고, 테이터의 보안, 무결성 등을 정의합니다.
  GRANT, REVOKE 등이 여기에 해당합니다.

 

### 2. Database 생성하기

콘솔에서 다음과 같이 명령을 실행합니다.

MySQL 관리자 계정인 root로 데이터베이스 관리 시스템에 접속하겠다는 것입니다.

```cmd
mysql –uroot  -p
```

window 사용자는 설치 시에 입력했던 암호를 입력합니다.

맥 사용자는 암호가 없으니 그냥 엔터를 입력하면 됩니다.

MySQL DBMS에 접속하면 “mysql>” 프롬프트가 보입니다.

![Database 생성하기](./img/2-1-01.png)

#### Database 생성하기

관리자 계정으로 MySQL에 접속했다면, 다음과 같은 명령으로 데이터베이스를 생성합니다.

```mysql
 mysql> create database DB이름;
```

우리는 다음과 같은 명령을 실행하여 DB이름을 “connectdb＂로 생성하도록 하겠습니다.

```mysql
mysql> create database connectdb;
```

![Database 생성하기](./img/2-1-02.png)



### 3. Database 사용자 생성과 권한 주기

- Database를 생성했다면, 해당 데이터베이스를 사용하는 계정을 생성해야 합니다.
- 또한, 해당 계정이 데이터베이스를 이용할 수 있는 권한을 줘야 합니다.
- 아래와 같은 명령을 이용해서 사용자 생성과 권한을 줄 수 있습니다.
- db이름 뒤의 * 는 모든 권한을 의미합니다.
- @’%’는 어떤 클라이언트에서든 접근 가능하다는 의미이고, @’localhost’는 해당 컴퓨터에서만 접근 가능하다는 의미입니다.
- `flush privileges`는 DBMS에게 적용을 하라는 의미입니다. 해당 명령을 반드시 실행해줘야 합니다.

> mysql 8버전에서는 create user를 먼저 해주고 grant를 해주셔야 합니다.

```mysql
grant all privileges on db이름.* to 계정이름@'%' identified by ＇암호';
grant all privileges on db이름.* to 계정이름@'localhost' identified by ＇암호’;
flush privileges;
```

- 사용자 계정이름은 'connectuser', 암호는 'connect123!@#', 해당 사용자가 사용하는 데이터베이스는 'connectdb'로 계정을 생성하려면 다음과 같이 명령을 수행합니다.

```mysql
grant all privileges on connectdb.* to connectuser@'%' identified by 'connect123!@#';

grant all privileges on connectdb.* to connectuser@'localhost' identified by 'connect123!@#';

flush privileges;
```

![Database 사용자 생성과 권한 주기](./img/2-1-03.png)

#### MySQL 8.0

- mysql 8버전에서는 `create user`를 먼저 해주고 `grant`를 해주셔야 합니다.

```mysql
create user '계정이름'@'localhost' identified by '암호';
grant all privileges on db이름.* to '계정이름'@'localhost' with grant option;
flush privileges;
```

- 사용자 계정이름은 'connectuser', 암호는 'connect123!@#', 해당 사용자가 사용하는 데이터베이스는 'connectdb'로 계정을 생성하려면 다음과 같이 명령을 수행합니다.

```mysql
create user 'connectuser'@'localhost' identified by 'connect123!@#';

grant all privileges on *.* to 'connectuser'@'localhost' with grant option;

flush privileges;
```



### 4. 생성한 Database에 접속하기

아래와 같이 명령을 실행하여 원하는 데이터베이스에 접속할 수 있습니다.

```mysql
mysql –h호스트명 –uDB계정명 –p 데이터베이스이름
```

db이름이 connectdb, db계정이 connectuser, 암호가 connect123!@# 일 경우 콘솔창에서 다음과 같이 입력합니다.

```mysql
mysql –h127.0.0.1 –uconnectuser –p connectdb [enter]
```

![생성한 Database에 접속하기](./img/2-1-04.png)

- 다음과 같이 프롬프트가 보이면 성공



### 5. MySQL 연결끊기

프롬프트에서 `quit`혹은 `exit`라고 입력합니다.

```mysql
mysql> quit
mysql> exit
```

![MySQL 연결끊기](./img/2-1-05.png)

- 다음과 같이 Bye라고 나오면 연결 끊기 성공



### 6. SQL 입력하기

#### 6.1. MySQL 버전과 현재 날짜 구하기

```mysql
mysql> SELECT VERSION(), CURRENT_DATE;
+-----------+--------------+
| VERSION() | CURRENT_DATE |
+-----------+--------------+
| 5.1.67    | 2013-01-05   |
+-----------+--------------+
1 row in set (0.00 sec)
```

프롬프트에서는 SQL을 입력합니다.

SQL은 semicolon (;)으로 끝납니다.

SQL은 쿼리(Query)라고 읽습니다.

쿼리는 DBMS에게 명령을 내릴 때 사용하는 문장이라고 생각하면 쉽습니다.

SELECT는 어떤 내용을 조회할 때 사용하는 키워드입니다.

MySQL은 쿼리에 해당하는 결과의 전체 row를 출력하고 마지막에 전체 row 수와 쿼리실행에 걸린 시간을 표시합니다.

#### 6.2. 키워드는 대소문자를 구별하지 않는다.

다음 쿼리들은 모두 같습니다.

```mysql
mysql> SELECT VERSION(), CURRENT_DATE;
mysql> select version(), current_date;
mysql> SeLeCt vErSiOn(), current_DATE;
```

#### 6.3. 쿼리를 이용해서 계산식의 결과도 구할 수 있다.

 함수 및 수식 사용 예제

```mysql
mysql> SELECT SIN(PI()/4), (4+1)*5;
+-------------+---------+
| SIN(PI()/4) | (4+1)*5 |
+-------------+---------+
|    0.707107 |      25 |
+-------------+---------+
```

#### 6.4. 여러 문장을 한 줄에 연속으로 붙여서 실행가능하다.

각 문장에 `semicolon(;)`만 붙혀 주면 됩니다.

```mysql
mysql> SELECT VERSION(); SELECT NOW();
+--------------+
| VERSION()    |
+--------------+
| 3.22.20a-log |
+--------------+
+---------------------+
| NOW()               |
+---------------------+
| 2004 00:15:33 |
+---------------------+
```

#### 6.5. 하나의 SQL은 여러 줄로 입력가능하다.

MySQL은 문장의 끝을 라인으로 구분하는 것이 아니라 `semicolon(;)`으로 구분하기 때문에 여러 줄에 거쳐 문장을 쓰는 것도 가능합니다.

```mysql
mysql> SELECT
    -> USER()
    -> ,
    -> CURRENT_DATE;
+--------------------+--------------+
| USER()             | CURRENT_DATE |
+--------------------+--------------+
| joesmith@localhost | 1999-03-18   |
+--------------------+--------------+
```

#### 6.6. SQL을 입력하는 도중에 취소할 수 있다.

긴 쿼리를 작성하다가 중간에 취소해야 하는 경우에는 즉시 `\c`를 붙혀주면 됩니다.

```mysql
mysql> SELECT

    -> USER()

    -> \c

mysql>
```

#### 6.7. DBMS에 존재하는 데이터베이스 확인하기

작업하기 위한 데이터베이스를 선택하기 위해서는 어떤 데이터베이스가 존재하는지 알아보아야 합니다.

현재 서버에 존재하는 데이터베이스를 찾아보기 위해서 `show` statement을 사용합니다.

```mysql
mysql> show databases;
+-----------------------+
| Database               |
+-----------------------+
| information_schema |
| connectdb              |
+-----------------------+
2 rows in set (0.00 sec)
```

#### 6.8. 사용중인 데이터베이스 전환하기

데이터베이스를 선택하기 위해, `use` command를 사용합니다.

```mysql
mysql> use mydb;
```

데이터베이스를 전환하려면, 이미 데이터베이스가 존재해야 하며 현재 접속 중인 계정이 해당 데이터베이스를 사용할 수 있는 권한이 있어야 합니다.



### 7. 데이터를 저장하는 공간 테이블(Table)

- 마이크로소프트의 엑셀(Excel)을 실행하면 표가 나옵니다. 이러한 표에 각종 값을 저장할 수 있습니다.
- 데이터베이스도 엑셀의 표와 유사한 테이블을 가질 수 있습니다.
- 엑셀과 다른 점은 데이터베이스를 생성해도 테이블은 존재하지 않는다는 것입니다.
- 테이블을 사용하려면 테이블을 생성하는 SQL을 사용해야 합니다.
- 그리고, 테이블에 값을 저장하려면 저장하기 위한 SQL을 사용해야 합니다.

- **테이블(table)의 구성요소**
  - 테이블 : RDBMS의 기본적 저장구조 한 개 이상의 column과 0개 이상의 row로 구성합니다.
  - 열(Column) : 테이블 상에서의 단일 종류의 데이터를 나타냄. 특정 데이터 타입 및 크기를 가지고 있습니다.
  - 행(Row) : Column들의 값의 조합. 레코드라고 불림. 기본키(PK)에 의해 구분. 기본키는 중복을 허용하지 않으며 없어서는 안 됩니다.
  - Field : Row와 Column의 교차점으로 Field는 데이터를 포함할 수 있고 없을 때는 NULL 값을 가지고 있습니다.

![테이블의 구성요소](./img/2-1-06.png)



#### 7.1. 현재 데이터베이스에 존재하는 테이블 목록 확인하기

Database를 선택 후, Database의 전체 테이블 목록을 출력합니다.

```mysql
mysql> show tables;

Empty set (0.02 sec)
```

`empty set`은  데이터베이스에 어떤 테이블도 아직 생성되지 않았다는 것을 알려줍니다.

#### 7.2. SQL 연습을 위한 테이블 생성과 값의 저장

examples.sql을 다운로드 합니다. [링크 바로가기](https://www.edwith.org/downloadFile/fileDownload?attachmentId=304830&autoClose=true)

터미널에서 examples.sql이 있는 폴더로 이동한 후, 다음과 같이 명령을 수행합니다.

명령을 수행한 후 암호를 입력합니다.

```cmd
mysql -uconnectuser -p connectdb < examples.sql
```

examples.sql에는 연습을 위한 테이블 생성문과 해당 테이블에 값을 저장하는 입력문이 존재합니다.

```cmd
mysql –uconnectuser -p connectdb
```

위의 명령으로 connectdb에 접속한 후 다음과 같이 명령을 수행합니다.

```mysql
mysql> show tables;
```

위의 명령은 접속한 db의 테이블 목록을 보는 명령입니다.

![테이블 목록](./img/2-1-07.png)

#### 7.3. 테이블 구조를 확인하기 위한 DESCRIBE 명령

table 구조를 확인하기 위해, `DESCRIBE` 명령을 사용할 수 있습니다.

짧게 `DESC`라고 사용해도 됩니다.

EMPLOYEE테이블의 구조를 확인해 봅시다.

```mysql
mysql> desc EMPLOYEE;
```

![테이블 구조를 확인하기 위한 describe 명령](./img/2-1-08.png)



### * 참고 자료

[SQL이란 무엇인가](http://www.ciokorea.com/print/35385)

[13.1.11 CREATE DATABASE Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/create-database.html)

[13.7.1.4 GRANT Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/grant.html)

[13.2.9 SELECT Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/select.html)

[MySQL Workbench 사용](https://opentutorials.org/course/3161/19548)





## 2) DML(select, insert, update, delete)

### 1. 데이터 조작어(Data Manipulation Language, DML)의 종류

데이터 조작어는 모두 동사로 시작합니다.

시작하는 동사에 따라서 다음과 같은 4가지 조작어가 있습니다.

- SELECT – 검색
- INSERT - 등록
- UPDATE - 수정
- DELETE - 삭제



### 2. SELECT (데이터 검색)

#### 2.1. SELECT 구문의 기본문형

![SELECT 구문의 기본문형](./img/2-2-01.png)

##### 2.1.1. 전체 데이터 검색

- SELECT 뒤에 `*` 를 기술함으로써 나타낼 수 있습니다.

- 예제 : departments 테이블의 모든 데이터를 출력하시오.

```markup
  SELECT * FROM  DEPARTMENT;
```

![SELECT 구문 예제(전체 데이터 검색)](./img/2-2-02.png)

##### 2.1.2. 특정 컬럼 검색

- SELECT 뒤에 컬럼을 `콤마(,)`로 구별해서 나열합니다.

- 예제 : employee 테이블에서 직원의 사번(empno), 이름(name), 직업(job)을 출력하시오.

> 어떤 칼럼이 있는지는 `desc`명령으로 확인할 수 있습니다.

```markup
select empno, name, job from employee;
```

![SELECT 구문 예제(특정 컬럼 검색)](./img/2-2-03.png)

##### 2.1.3. 컬럼에 Alias 부여하기

- 컬럼에 대한 ALIAS(별칭)을 부여해서 나타내는 칼럼의 HEADING을 변경할 수 있습니다.
- 컬럼 뒤에 `as`나 `공백`을 사용합니다.
- ALIAS에 공백이 포함될 경우 `''`로 감싸줍니다.

- 예제 : employee 테이블에서 직원의 사번(empno), 이름(name), 직업(job)을 출력하시오.

```markup
select empno as 사번, name as 이름, job as 직업 from employee;
select empno 사번, name 이름, job 직업 from employee;
```

![SELECT 구문 예제(컬럼에 Alias 부여하기)](./img/2-2-04.png)

##### 2.1.4. 컬럼의 합성(Concatenation)

- 문자열 결합함수 `concat`를 사용합니다.

- 예제 : employee 테이블에서 사번과 부서번호를 하나의 칼럼으로 출력하시오.

```markup
SELECT concat( empno, '-', deptno) AS '사번-부서번호' FROM employee;
```

![SELECT 구문 예제(컬럼의 합성)](./img/2-2-05.png)

##### 2.1.5. 중복행의 제거

- 중복되는 행이 출력되는 경우, `DISTINCT `키워드로 중복행을 제거할 수 있습니다.

- 예제1 : 사원 테이블의 모든 부서번호 출력하시오. (사원 수 만큼 출력된다.)

```markup
select deptno from employee;
```

![SELECT 구문 예제(중복행의 제거)](./img/2-2-06.png)

- 예제2 : 사원 테이블의 부서번호를 중복되지 않게 출력하시오.

```markup
select distinct deptno from employee;
```

![SELECT 구문 예제(중복행의 제거)](./img/2-2-07.png)

#### 2.2. ORDER BY 절 (정렬하기)

![SELECT 구문 예제(정렬하기)](./img/2-2-08.png)

##### 2.2.1. 정렬

- 예제1 : employee 테이블에서 직원의 사번(empno), 이름(name), 직업(job)을 출력하시오. (단, 이름을 기준으로 오름차순 정렬합니다.)

  ```markup
  select empno, name, job from employee order by name;
  
  select empno as 사번, name as 이름, job as 직업 from employee order by 이름;
  
  select empno, name, job from employee order by 2;
  ```

  - **alias를 사용하지 않았을 경우**

  ![SELECT 구문 예제(정렬하기)](./img/2-2-09.png)

  - **alias를 사용했을 경우**

  ![SELECT 구문 예제(정렬하기)](./img/2-2-10.png)

  - **컬럼 번호를 이용한 경우**

![SELECT 구문 예제(정렬하기)](./img/2-2-11.png)

- 예제2 : employee 테이블에서 직원의 사번(empno), 이름(name), 직업(job)을 출력하시오. (단, 이름을 기준으로 내림차순 정렬합니다.)

```markup
select empno, name, job from employee order by name desc;
```

![SELECT 구문 예제(정렬하기)](./img/2-2-12.png)

#### 2.3. WHERE 절 (특정 행 검색)

![WHERE 절 (특정 행 검색)](./img/2-2-13.png)

##### 2.3.1. 산술비교 연산자

- 예제 : employee 테이블에서 고용일(hiredate)이 1981년 이전의 사원이름과 고용일을 출력하시오.

  ```mysql
  select name, hiredate from employee where hiredate < '1981-01-01';
  ```

![WHERE 절 - 산술비교 연산자](./img/2-2-14.png)

##### 2.3.2. 논리 연산자

- 예제 : employee 테이블에서 부서번호가 30인 사원이름과 부서번호를 출력하시오.

  ```mysql
  select name, deptno from employee where deptno = 30;
  ```

![WHERE 절 - 논리 연산자](./img/2-2-15.png)

##### 2.3.3. IN 키워드

- 예제 : employee 테이블에서 부서번호가 10 또는 30인 사원이름과 부서번호를 출력하시오.

  ```mysql
  select name, deptno from employee where deptno in (10, 30);
  select name, deptno from employee where deptno = 10 or deptno = 30;
  ```

![WHERE 절 - IN 키워드](./img/2-2-16.png)

##### 2.3.4. LIKE 키워드

- 와일드 카드를 사용하여 특정 문자를 포함한 값에 대한 조건을 처리
- `%`는 0에서부터 여러 개의 문자열을 나타냄
- `_`는 단 하나의 문자를 나타내는 와일드 카드

- 예제 : employee 테이블에서 이름에 'A'가 포함된 사원의 이름(name)과 직업(job)을 출력하시오.

```mysql
select name, job from employee where name like '%A%';

-- 이름이 A로 시작하는 사람
select name, job from employee where name like 'A%';

-- 이름이 A로 끝나는 사람
select name, job from employee where name like 'A%';

-- 이름의 두번째 글자가 A인 사람
select name, job from employee where name like '_A%';
```

![WHERE 절 - LIKE 키워드](./img/2-2-17.png)

#### 2.4. 함수의 사용

- from 다음에 테이블이 없을 경우에는 테이블에서 조회하는 것이 아닙니다.
- Oracle의 경우 `from DUAL`을 붙여서 사용합니다.

##### 2.4.1. UCASE, UPPER (대문자로 변환)

```mysql
mysql> SELECT UPPER('SEoul'), UCASE('seOUL');
 +-----------------+-----------------+
  | UPPER('SEoul') | UCASE('seOUL') |
  +-----------------+-----------------+
  | SEOUL            | SEOUL            |
  +-----------------+-----------------+
```

##### 2.4.2. LCASE, LOWER (소문자로 변환)

```mysql
mysql> SELECT LOWER('SEoul'), LCASE('seOUL');
 +-----------------+-----------------+
  | LOWER('SEoul') | LCASE('seOUL') |
  +-----------------+-----------------+
  | seoul              | seoul             |
  +-----------------+-----------------+
```

```mysql
mysql> select lower(name) from employee;
+-------------+
| lower(name) |
+-------------+
| smith       |
| allen       |
| ward        |
| jones       |
| martin      |
| blake       |
| clark       |
| scott       |
| king        |
| turner      |
| adams       |
| james       |
| ford        |
| miller      |
+-------------+
```

##### 2.4.3. SUBSTRING (문자열 자르기)

- 인덱스가 1번부터 시작합니다.
- `substr`로도 사용 가능합니다.

```mysql
mysql> SELECT SUBSTRING('Happy Day',3,2);
  +-----------------+-----------------+
  | SUBSTRING('Happy Day',3,2)      |
  +-----------------+-----------------+
  | pp                                       |
  +-----------------+-----------------+
```

##### 2.4.4. LPAD, RPAD (문자 채우기)

```mysql
mysql> SELECT LPAD('hi',5,'?'),LPAD('joe',7,'*');
  +------------------+-------------------+
  | LPAD('hi',5,'?')    | LPAD('joe',7,'*')   |
  +------------------+-------------------+
  | ???hi               |           ****joe    |
  +------------------+-------------------+
```

```mysql
mysql> select lpad(name, 10, '+') from employee;
+---------------------+
| lpad(name, 10, '+') |
+---------------------+
| +++++SMITH          |
| +++++ALLEN          |
| ++++++WARD          |
| +++++JONES          |
| ++++MARTIN          |
| +++++BLAKE          |
| +++++CLARK          |
| +++++SCOTT          |
| ++++++KING          |
| ++++TURNER          |
| +++++ADAMS          |
| +++++JAMES          |
| ++++++FORD          |
| ++++MILLER          |
+---------------------+
```

##### 2.4.5. TRIM, LTRIM, RTRIM (공백 제거)

```mysql
mysql> SELECT LTRIM(' hello '), RTRIM(' hello ');
+-------------------------------------+
| LTRIM(' hello ') | RTRIM(' hello ')  |
+-------------------------------------+
| 'hello '            | '  hello‘            |
+-------------------------------------+
```

```mysql
mysql> SELECT TRIM(' hi '),TRIM(BOTH 'x' FROM 'xxxhixxx');
+----------------+-----------------------------------+
| TRIM(' hi ')     | TRIM(BOTH 'x' FROM 'xxxhixxx') |
+----------------+-----------------------------------+
| hi                 | hi                                       |
+----------------+-----------------------------------+
```

##### 2.4.6. ABS(x) : x의 절대값을 구합니다.

```mysql
mysql> SELECT ABS(2), ABS(-2);
+-----------+------------+ 
| ABS(2)     | ABS(-2)    | 
+-----------+------------+ 
| 2            | 2             | 
+-----------+------------+
```

##### 2.4.7. MOD(n,m) % : n을 m으로 나눈 나머지 값을 출력합니다.

```mysql
mysql> SELECT UPPER('SEoul'), UCASE('seOUL');
 +-----------------+-----------------+
  | UPPER('SEoul') | UCASE('seOUL') |
  +-----------------+-----------------+
  | SEOUL            | SEOUL            |
  +-----------------+-----------------+
```

##### 2.4.8. 그 밖의 함수

- `FLOOR(x)` : x보다 크지 않은 가장 큰 정수를 반환합니다. BIGINT로 자동 변환합니다.
- `CEILING(x)` : x보다 작지 않은 가장 작은 정수를 반환합니다.
- `ROUND(x)` : x에 가장 근접한 정수를 반환합니다.
- `POW(x,y)`, `POWER(x,y)` : x의 y 제곱 승을 반환합니다.
- `GREATEST(x,y,...)` : 가장 큰 값을 반환합니다.
- `LEAST(x,y,...)` : 가장 작은 값을 반환합니다.
- `CURDATE()`, `CURRENT_DATE` : 오늘 날짜를 YYYY-MM-DD나 YYYYMMDD 형식으로 반환합니다.
- `CURTIME()`, `CURRENT_TIME` : 현재 시각을 HH:MM:SS나 HHMMSS 형식으로 반환합니다.
- `NOW()`, `SYSDATE()` , `CURRENT_TIMESTAMP` : 오늘 현시각을 YYYY-MM-DD HH:MM:SS나 YYYYMMDDHHMMSS 형식으로 반환합니다. 
- `DATE_FORMAT(date,format)` : 입력된 date를 format 형식으로 반환합니다.
- `PERIOD_DIFF(p1,p2)` : YYMM이나 YYYYMM으로 표기되는 p1과 p2의 차이 개월을 반환합니다.

#### 2.5. CAST 형변환

![CAST 형변환](./img/2-2-18.png)

```mysql
mysql> select cast(now() as date);
+---------------------+
| cast(now() as date) |
+---------------------+
| 2003-09-25          |
+---------------------+
1 row in set (0.00 sec)
```

```mysql
mysql> select cast(1-2 as unsigned);
+----------------------------+
|   cast(1-2 as unsigned)    |
+----------------------------+
|  18446744073709551615 |
+----------------------------+
```

#### 2.6. 그룹함수

![그룹함수](./img/2-2-19.png)

- 예제 : employee 테이블에서 부서번호가 30인 직원의 급여 평균과 총합계를 출력하시오.

```mysql
SELECT AVG(salary) , SUM(salary)
FROM employee
WHERE deptno = 30;
```

![그룹함수](./img/2-2-20.png)

##### 2.6.1. 그룹함수와 GROUP BY 절

- 예제 : employee 테이블에서 부서별 직원의 부서번호, 급여 평균과 총합계를 출력하시오.

```mysql
SELECT deptno, AVG(salary) , SUM(salary)
FROM employee
group by deptno;
```

![그룹함수](./img/2-2-21.png)



### 3. INSERT (데이터 입력)

![INSERT (데이터 입력)](./img/2-2-22.png)

- 예제 : ROLE테이블에 role_id는 200, description에는 'CEO'로 한건의 데이터를 저장하시오.

``` mysql
insert into ROLE (role_id, description) values ( 200, 'CEO');
```

![INSERT (데이터 입력)](./img/2-2-23.png)



### 4. UPDATE (데이터 수정)

![UPDATE (데이터 수정)](./img/2-2-24.png)

- 예제 : ROLE테이블에 role_id가 200일 경우 description을 'CTO'로 수정하시오.

``` mysql
update ROLE
      set description = 'CTO'
where role_id = 200;
```

![UPDATE (데이터 수정)](./img/2-2-25.png)



### 5. DELETE (데이터 삭제)

![DELETE (데이터 삭제)](./img/2-2-26.png)

- 예제 : ROLE테이블에서 role_id는 200인 정보를 삭제하시오.

```mysql
delete from ROLE where role_id = 200;
```

![DELETE (데이터 삭제)](./img/2-2-27.png)



### * 참고 자료

[13.2.10 SELECT Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/select.html)

[13.2.6 INSERT Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/insert.html)

[13.2.13 UPDATE ver8.0](https://dev.mysql.com/doc/refman/8.0/en/update.html)

[13.2.2 DELETE Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/delete.html)

[SQL Joins Explained](http://www.sql-join.com/)

[SQL Joins](https://www.w3schools.com/sql/sql_join.asp)

[테이블 JOIN - SQL 프로그래밍 배우기 (Learn SQL Programming)](http://www.sqlprogram.com/Basics/sql-join.aspx)





## 3) DDL(create, drop)

### 1. MySQL 데이터 타입

![MySQL 데이터 타입](./img/2-3-01.png)

![MySQL 데이터 타입](./img/2-3-02.png)



### 2. CREATE TABLE

![CREATE TABLE](./img/2-3-03.png)

- 예제1 : EMPLOYEE와 같은 구조를 가진 EMPLOYEE2 테이블을 생성하시오.

![CREATE TABLE](./img/2-3-04.png)

``` mysql
CREATE TABLE EMPLOYEE2(   
           empno      INTEGER NOT NULL PRIMARY KEY,  
           name       VARCHAR(10),   
           job        VARCHAR(9),   
           boss       INTEGER,   
           hiredate   VARCHAR(12),   
           salary     DECIMAL(7, 2),   
           comm       DECIMAL(7, 2),   
           deptno     INTEGER);
```

- 예제2 : book 테이블을 생성하시오.

``` mysql
CREATE TABLE BOOK(
           isbn       varchar(10) primary key,
           title      varchar(20) not null,
           price      integer not null);
```

![CREATE TABLE](./img/2-3-05.png)



### 3. ALTER TABLE

![ALTER TABLE](./img/2-3-06.png)

#### 3.1. 컬럼 추가

- 예제1 : EMPLOYEE2 테이블에 생일(birthdate) 칼럼을 varchar(12) 형식으로 추가하시오.

``` mysql
alter table EMPLOYEE2
add birthdate varchar(12);
```

![ALTER TABLE - 컬럼 추가](./img/2-3-07.png)

- 예제2 : book 테이블에 작가(author) 칼럼을 varchar(20) 형식으로 추가하시오.

```mysql
mysql> alter table book
    -> add author varchar(20);
Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc book;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| isbn   | varchar(10) | NO   | PRI | NULL    |       |
| title  | varchar(20) | NO   |     | NULL    |       |
| price  | int         | NO   |     | NULL    |       |
| author | varchar(20) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
4 rows in set (0.02 sec)
```



#### 3.2. 컬럼 삭제

- 예제1 : EMPLOYEE2 테이블의 생일(birthdate) 칼럼을 삭제하시오.

``` mysql
alter table EMPLOYEE2
drop birthdate;
```

![ALTER TABLE - 컬럼 삭제](./img/2-3-08.png)

- 예제2 : book 테이블의 가격(price) 칼럼을 삭제하시오.

```mysql
mysql> alter table book
    -> drop price;
Query OK, 0 rows affected (0.07 sec)
Records: 0  Duplicates: 0  Warnings: 0

mysql> desc book;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| isbn   | varchar(10) | NO   | PRI | NULL    |       |
| title  | varchar(20) | NO   |     | NULL    |       |
| author | varchar(20) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)
```



#### 3.3. 컬럼 수정

![ALTER TABLE - 컬럼 수정](./img/2-3-09.png)

- 예제 : EMPLOYEE2 테이블의 부서번호(deptno)를 dept_no로 수정하시오.

``` mysql
alter table EMPLOYEE2
change deptno dept_no int(11);
```

![ALTER TABLE - 컬럼 수정](./img/2-3-10.png)

#### 3.4. 테이블 이름 변경

![ALTER TABLE - 테이블 이름 변경](./img/2-3-11.png)

- 예제 : EMPLOYEE2 테이블의 이름을 EMPLOYEE3로 변경하시오.

``` mysql
alter table EMPLOYEE2
rename EMPLOYEE3;
```

![ALTER TABLE - 테이블 이름 변경](./img/2-3-12.png)



### 4. DROP TABLE

![DROP TABLE](./img/2-3-13.png)

- 예제 : EMPLOYEE2 테이블을 삭제하시오.

> 테이블 삭제 후 desc 명령을 수행하면, 존재하지 않는 테이블이라고 표시됩니다.

```mysql
drop table EMPLOYEE2;
```

![DROP TABLE](./img/2-3-14.png)



### * 생각해보기

- 칼럼의 길이가 10인데, 해당 칼럼에 값이 저장되어 있습니다. 이 때 칼럼의 길이를 5로 바꾼다면 어떤 일이 벌어질까요?
  -  오류로 바꿔지지 않습니다.
- 문자열을 저장하는 데이터 타입인 `CHAR`와` VARCHAR` 차이점에 대해 알아보고 어떤 상황에서 CHAR 또는 VARCHAR 를 선택하는 것이 효율적인지 생각해봅시다.
  - varchar와 char은 실제 할당 저장 공간에 차이가 있고, 문자열 비교 방법이 다릅니다. varchar는 지정한 최대 길이 내에서 각 데이터 크기에 맞게 가변적으로 저장 공간을 줍니다. char은 지정한 길이 만큼 공백을 채워 고정된 저장 공간을 할당합니다. 대신 char는 추가로 연산할 필요가 없기에 검색 속도가 월등히 빠릅니다. 문자열 비교에서도 두 타입은 차이가 있습니다. 이름, 주소 등 길이가 다양한 경우엔 varchar를 써서 저장 공간을 줄이고, 주민등록번호 같이 길이가 일정하면 char를 쓰는 게 좋습니다.
- 문자열 데이터 타입에는 문자셋을 지정할 수 있습니다. 문자셋에 따라 해당 필드가 차지하는 공간 크기를 한번 계산해보자. (예: VARCHAR(10) CHARACTER SET UTF8; 은 몇 Byte 크기를 차지할까요? ASCII 일때는 또 몇 Byte 크기를 가질까요?
  - UTF-8은 원래 가변4바이트이지만 MYSQL에서는 가변3바이트로 만들었습니다. 후에 Emoji문자들이 4바이트를 사용해, UTF-8mb4를 만들어 가변4바이트가 가능해졌습니다.
  - 텍스트 encoding(character set)에 따른 max length는 mysql document에서 자세히 확인할 수 있습니다. 각 encoding character의 문자 1개에 할당 가능한 최대 byte가 max_len으로 명시되어 있습니다. 같은 encoding이라도 character에 따라 작은 크기의 공간을 할당할 수 있습니다.



### * 참고 자료

[13.1.20 CREATE TABLE Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/create-table.html)

[13.1.9 ALTER TABLE Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/alter-table.html)

[13.1.32 DROP TABLE Syntax ver8.0](https://dev.mysql.com/doc/refman/8.0/en/drop-table.html)

[CHAR와 VARCHAR 비교](https://hyeonstorage.tistory.com/290)

[CHAR와 VARCHAR 비교](https://hack-cracker.tistory.com/165)

[10.10 Supported Character Sets and Collations](https://dev.mysql.com/doc/refman/8.0/en/charset-charsets.html)



# 3. 개발환경 설정

## 1) JDK 다운받기 및 설치하기

> JAVA언어를 작성된 프로그램을 실행하기 위해선 JRE(Java SE Runtime Environment)가 필요합니다.
>
> JAVA언어를 사용하는 개발자가 아니라 JAVA언어로 만들어진 프로그램을 실행하는 사용자라면 JRE만 컴퓨터에 설치하면 됩니다.
>
> 보통 사용자 입장에서 JAVA를 설치한다는 것은 JRE를 설치하는 것을 말합니다.
>
> JAVA언어를 사용하는 개발자는 JAVA언어로 작성된 소스(Source)를 컴파일하고 관리할 필요가 있습니다.
>
> 이때 사용되는 도구를 JDK(Java SE Development Kit)라고 말합니다.
>
> JDK안에는 JRE도 포함되어 있습니다.
>
> 컴파일한 결과를 실행하기 위해서는 JRE가 필요하기 때문입니다.

### 1. JDK 다운로드 및 설치

- JDK는 Oracle 사이트에서 무료로 다운로드하여 설치할 수 있습니다.

브라우저로 다음의 URL을 입력하여 이동합니다.

[https://www.oracle.com/java/technologies](https://www.oracle.com/java/technologies)

![jdk - window용 설치](./img/3-1-01.png)

위의 그림과 같이 화면이 보여지면, `Java SE`를 클릭합니다.

![jdk - window용 설치](./img/3-1-02.png)

> 본 과정에서는 JDK8 사용

Oracle JDK 8을 다운로드 받으려면 회원가입 후 로그인을 해야합니다.

만약 회원가입을 원하지 않는다면, Open JDK를 이용하는 방법도 있습니다.

구글에서 `Open JDK 8 설치`라고 검색한 후 설치하시면 됩니다.

위의 그림과 같이 스크롤을 내려 `JDK Download` 버튼을 클릭합니다.

#### 1.1. windows용 설치

![jdk - window용 설치](./img/3-1-03.png)

본인이 사용하는 운영체제에 맞는 JDK를 다운로드 해야합니다.

Mac 운영체제를 사용한다면 MacOS에 해당하는 `jdk-8uOOO-maxosx-x64.dmg`를 클릭하고, MS윈도우 32비트 운영체제를 사용한다면 `jdk-8uOOO-windows-i586.exe`를 클릭하여 다운로드 받습니다.

참고로 MS윈도우 64비트 운영체제의 경우에는 `jdk-8uOOO-windows-x64.exe`를 다운로드 받습니다.

![jdk - window용 설치](./img/3-1-04.png)

JDK를 다운로드 받으려면 먼저 라이센스(License)에 동의해야합니다.

위의 그림과 같은 팝업창이 뜨면 체크버튼을 클릭합니다.

![jdk - window용 설치](./img/3-1-05.png)

다운받은 MS Windows 64bit용 `jdk-8uOOO-windows-x64.exe` 파일을 더블클릭하여 실행하면 위의 그림과 같은 메시지가 보여집니다.

Next 버튼을 클릭합니다.

![jdk - window용 설치](./img/3-1-06.png)

JDK가 설치될 경로(Path)를 지정합니다.

JDK가 설치되는 경로를 `JAVA_HOME` 경로라고도 말합니다.

해당 경로를 꼭 기억해주세요. 환경설정할 때 알아야 합니다.

Next 버튼을 클릭합니다.

![jdk - window용 설치](./img/3-1-07.png)

JDK 설치가 끝나면 JRE가 설치될 경로를 설정하게 됩니다.

Next 버튼을 클릭합니다.

![jdk - window용 설치](./img/3-1-08.png)

설치가 진행되고 있습니다. 잠시만 기다려주세요.

![jdk - window용 설치](./img/3-1-09.png)

설치가 완료되었습니다.

#### 1.2. max os용 설치

![jdk - mac os용 설치](./img/3-1-10.png)

`jdk-8uOOO-macosx-x64.dmg`를 다운로드 받습니다.

![jdk - mac os용 설치](./img/3-1-11.png)

다운로드 받은 파일을 더블 클릭하면 위와 같은 창이 열립니다.

![jdk - mac os용 설치](./img/3-1-12.png)

위와 같이 JDK 설치 마법사가 실행됩니다.

![jdk - mac os용 설치](./img/3-1-13.png)

맥의 관리자 ID와 암호를 입력하라는 창이 보여집니다.

본인의 맥 ID와 암호를 입력하세요.

![jdk - mac os용 설치](./img/3-1-14.png)

설치가 완료되었습니다.



### * 생각해보기

- JDK가 운영체제별로 설치파일을 제공하는 이유는 무엇입니까?
  - JAVA는 운영체제에 독립적으로 작동하기 때문입니다. 독립적으로 파일이 실행되기 위해서는 실행되는 환경 즉, JRE가 제대로 갖춰져 있어야 하며, 이 때문에 JDK를 설치할 때 운영체제별로 다르게 설치해야 합니다.



### * 참고 자료

[Oracle jdk 설치 링크](https://www.oracle.com/java/technologies/javase-downloads.html)

[open jdk 설치 링크](https://openjdk.java.net/install/)



## 2) 환경설정하기

JDK를 설치한 이후에는 JDK를 콘솔(console) 환경에서 잘 실행될 수 있도록 시스템 환경 설정을 해야 합니다.

시스템 환경 설정을 하는 방법은 운영체제에 따라서 다릅니다. 

### 1. JAVA 환경설정

JDK설치가 완료되었다면, JDK에 대한 시스템 환경설정을 해야 합니다.

시스템 환경설정을 하는 방법은 운영체제마다 다릅니다.

운영체제 마다 시스템 환경설정하는 방법은 다르지만, 설정해야 할 환경변수의 이름은 같습니다.

설정해야 할 환경변수는 다음과 같은 3가지입니다.

- JAVA_HOME : JAVA가 설치된 경로를 지정
- CLASSPATH : JAVA 클래스가 있는 경로들을 지정
- PATH : JAVA 실행파일이 있는 경로를 추가

JAVA_HOME, CLASSPATH는 시스템 환경변수에 새롭게 추가될 환경 변수이고, PATH는 기존에 존재하는 환경 변수입니다.

#### 1.1. MS Windows 10에서의 환경설정

MS Windows 10에서 JDK 관련된 환경변수를 설정해 보도록 하겠습니다.

![java 환경설정 - windows 10 설치](./img/3-2-01.png)

`찾기` 버튼을 누른 다음에 `시스템 환	`까지 입력합니다.

그러면 검색 결과에 `시스템 환경 변수 편집`이라는 결과가 보여질 것입니다.

`시스템 환경 변수 편집`을 선택합니다.

![java 환경설정 - windows 10 설치](./img/3-2-02.png)

위와 같은 창이 열리면 `환경변수` 버튼을 클릭합니다.

![java 환경설정 - windows 10 설치](./img/3-2-03.png)

시스템 변수 영역의 `새로 만들기` 버튼을 클릭합니다.

![java 환경설정 - windows 10 설치](./img/3-2-04.png)

위의 그림과 같이 변수 이름엔 `JAVA_HOME`을, 변수 값엔 JDK가 설치된 경로를 입력합니다.

(파일 탐색기에서 해당 경로로 이동한 후 복사하여 붙이기를 추천합니다.)

![java 환경설정 - windows 10 설치](./img/3-2-05.png)

위의 그림과 같이 `JAVA_HOME` 환경변수가 시스템 변수 영역에 추가된 것을 확인할 수 있습니다.

![java 환경설정 - windows 10 설치](./img/3-2-06.png)

같은 방법으로 `CLASSPATH` 환경변수를 추가합니다.

값은 `.;%JAVA_HOME%\lib\tools.jar`로 입력합니다.

`%JAVA_HOME%`은 앞에서 설정한 `JAVA_HOME` 환경변수의 값으로 치환하라는 의미입니다.

![java 환경설정 - windows 10 설치](./img/3-2-07.png)

시스템 변수 영역에서 `PATH`를 찾아서 선택한 후 `편집` 버튼을 클릭한 후 위의 그림과 같은 창이 열리면 우측의 `새로 만들기` 버튼을 클릭한 후 

`%JAVA_HOME%\bin`을 입력합니다.

![java 환경설정 - windows 10 설치](./img/3-2-08.png)

`윈도우키 + R`을 입력하여 실행창이 열리도록 한 후, `cmd`라고 입력하고 엔터를 입력합니다.

이 때 cmd 콘솔(console) 창이 열리게 됩니다.

해당 콘솔창에서 다음와 같이 내용을 입력합니다.

```cmd
java -version
javac -version
```

`java` 명령은 JAVA로 작성된 프로그램을 실행할 때 사용하는 명령이고, `javac` 명령은 java로 작성된 프로그램을 컴파일할 때 사용하는 명령입니다.

위의 그림과 같이 실행 결과가 보인다면 설치가 잘 된 것입니다.

만약 java는 잘 실행되는데 javac가 제대로 실행되지 않는다면, 시스템 환경 변수 설정이 잘못 설정되었거나 JDK가 아닌 JRE만 설치되었을 때입니다.

환경변수에 오타가 있는지 확인하고 알맞게 수정하여 주세요.

환경변수가 수정되었다면 cmd 콘솔창을 닫고 다시 cmd 콘솔창을 열어서 명령을 실행해야 합니다.

#### 1.2. Mac OS에서의 환경설정

설치가 완료된 이후에, 터미널을 연 후 아래와 같이 명령을 내립니다.

```cmd
cd /Library/Java/JavaVirtualMachines
ls -la
```

그러면 아래와 같이 보일 것입니다.

위에서 사용한 명령은 맥 터미널 명령입니다. ( 리눅스도 같은 명령을 사용할 수 있습니다. )

2가지 버전의 jdk가 설치되어 있을 경우 jdk1.8.0_121.jdk 와 jdk1.8.0_91.jdk 같이 2가지가 보입니다.

처음 설치했다면 경로가 하나만 보일 것입니다.

![java 환경설정 - mac os 설치](./img/3-2-09.png)

```cmd
cd /Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home  
```

위와 같은 명령으로 경로를 이동해보세요.

중간에 있는 jdk1.8.0_121.jdk는 본인이 설치한 jdk와 같은 경로여야 합니다.

해당 경로를 `JAVA_HOME` 경로라고 합니다.

해당 경로에서 `ls -la` 명령을 내려보면 윈도우에서 설치한 JDK와 같은 내용이 보이는 것을 알 수 있을 것입니다.

이제 맥에서 JDK를 사용하기 위해서 환경설정을 해야 합니다.

먼저 다음과 같은 명령을 실행합니다.

``` cmd
sudo su -
```

위의 명령은 터미널에서 관리자로 권한을 바꾸겠다는 것을 의미합니다.

``` cmd
vi /etc/paths
```

위의 명령은 `vi`라는 에디터로 /etc/paths 라는 파일을 편집하겠다는 것을 의미합니다.

`vi 에디터`는 처음 사용하면 굉장히 어렵습니다.

인터넷에서 vi 에디터에 대한 사용법을 미리 공부한 후 사용해주세요.

에디터로 /etc/paths라는 파일을 열었다면 맨 아랫줄에 다음의 경로를 추가합니다.

``` cmd
/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home/bin
```

그리고 파일을 저장합니다.

이렇게 저장을 한 후, 다시 터미널을 열면 어디서든 `java`명령을 실행할 수 있습니다.

이번엔 다음과 같은 명령으로 `JAVA_HOME`과 `CLASSPATH` 환경변수를 지정합니다.

```cmd
vi /etc/profile
```

위의 명령을 실행한 후 맨 아랫줄에 다음의 내용을 추가합니다.

```cmd
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_121.jdk/Contents/Home
export CLASSPATH=.:$JAVA_HOME/lib/tools.jar
```

`CLASSPATH=`다음에 있는 문자열은 `점(.)`과 `콜론(:)`입니다.

점은 현재 경로를 말하고 콜론은 구분자입니다.

`CLASSPATH`로 현재 경로와 `$JAVA_HOME/lib/tools.jar`를 지정하라는 것을 의미합니다.

자 위와 같이 설정하였다면 터미널을 종료 후 다시 실행합니다.

그리고 아래와 같이 명령을 내려봅시다.

```cmd
java -version
```

아래의 그림과 같이 결과가 출력된다면 설치가 잘 된 것입니다.

![java 환경설정 - mac os 설치](./img/3-2-10.png)



### 2. 간단한 JAVA 프로그램 컴파일 및 실행

메모장을 열어 `Hello.java`라는 파일로 다음의 내용을 저장합니다.

```java
public class Hello{
     public static void main(String args[]){
       System.out.println("hello world");
     }
}
```

어떤 디렉토리에 저장해도 상관은 없습니다.

cmd 콘솔창을 연 후 다음과 같이 입력합니다.

```cmd
cd C:\Users\delig
```

본인이 저장한 디렉토리로 이동합니다.

```cmd
javac Hello.java
```

위의 명령은 `Hello.java` 소스파일을 컴파일하라는 명령입니다.

컴파일 되면 `Hello.class` 파일이 생성됩니다.

`Hello.class`파일이 생성되었다면, 다음의 명령으로 실행합니다.

```cmd
java Hello
```

`hello world`가 잘 출력되었다면, JDK설치부터 환경변수설정까지 잘 되었다는 것을 알 수 있습니다.

<img src="./img/3-2-11.png" alt="간단한 JAVA 프로그램 컴파일 및 실행" style="zoom:150%;" />



### * 생각해보기

- 자바로 작성된 프로그램을 실행하려면 JRE만 설치하면 됩니다. 이때는 환경변수를 설정할 필요가 없습니다. 그런데, JDK를 설치할 때는 환경변수를 설정해야 합니다. 환경변수를 설정하는 이유가 무엇일까요?
  - 환경 변수를 지정해두면, console에서는 `java`만 입력해도 path 환경변수 내 저장된 디렉토리들을 탐색하며 java 파일을 찾아 실행합니다. 즉 환경변수에 등록된 경로는 컴퓨터의 어떤 경로에서라도 접근할 수 있어 파일의 접근을 쉽고 편하게 해줍니다.
- 현재 설치된 JDK보다 높은 버전의 JDK를 설치했습니다. 이때 수정해야 할 환경변수는 무엇일까요?
  - `JAVA_HOME `을 수정해야 합니다. 나머지 환경변수들은 `JAVA_HOME`을 참조하여 디렉토리를 정하기 때문입니다.



## 3) 이클립스 다운받기 및 설치하고 인코딩 설정하기

### 1. 이클립스란?

IBM에서 웹 스피어 스튜디오 애플리케이션 디벨로퍼(WebSpheare Studio Application Developer)란 이름으로 JAVA언어를 이용하여 개발되었던 것인데, 핵심 부분을 오픈 소스로 공개하여 지금의 이클립스로 발전하게 되었습니다. 이클립스는 윈도우, 맥, 리눅스 등 다양한 운영체제에서 동작하며, JAVA를 비롯한 다양한 프로그래밍 언어를 개발할 수 있는 통합 개발 환경( Integrated Development Environment, IDE)이라고 말할 수 있습니다. 통합 개발 환경이란 코딩, 디버그, 컴파일, 배포 등 프로그램 개발에 관련된 모든 작업을 하나의 프로그램 안에서 처리할 수 있도록 환경을 제공하는 소프트웨어라고 생각하면 됩니다.

이클립스는 플러그인 구조로 쉽게 기능을 추가할 수 있는 구조로 되어 있습니다. 이런 구조 때문에 이클립스 기반으로 만들어진 다양한 도구들이 존재합니다. 또한 이클립스는 윈도우, 맥, 리눅스 운영체제를 지원하기 때문에 대부분의 환경에서 사용할 수 있다는 장점이 있습니다. 2001년 세상에 첫선을 보인 이래로 지속적으로 발전하여 최고의 개발 도구 중의 하나로 사랑받고 있습니다.



### 2. 이클립스 다운로드 및 설치

웹 브라우저로 이클립스 사이트에 접속합니다.

> 이클립스 버전에 따라 설치 방법이 조금씩 다를 수 있습니다.

[이클립스 Oxygen 다운로드](https://www.eclipse.org/downloads/packages/release/oxygen/3a)

이클립스를 이용하여 자바 웹 어플리케이션을 개발할 때 사용하려면 `Eclipse IDE for Java EE Developers`를 다운로드 받아야 합니다.

본인의 운영체제에 맞는 버전을 다운로드 받습니다.

목록을 살펴보면 알겠지만, 다양한 이클립스 버전이 있는 것을 알 수 있습니다.

Windows사용자는 자동으로 윈도우와 관련된 다운로드 링크가 보입니다.

![이클립스 설치](./img/3-3-01.png)

다운로드 링크를 클릭하여 다운로드 합니다.

약 340메가 정도의 파일이 다운로드 됩니다.

![이클립스 설치](./img/3-3-02.png)

이클립스는 압축만 해제하면 간단히 설치할 수 있습니다.

삭제할 때도 압축을 해제한 폴더만 삭제하면 됩니다.

다운로드 받은 파일인 `eclipse-jee-oxygen-3a-win32-x86_64.zip`의 압축을 해제합니다.

압축을 해제하면 `eclipse`란 폴더가 있고, 그 안에는 아래 그림과 같은 파일들이 있는 것을 확인할 수 있습니다.

![이클립스 설치](./img/3-3-03.png)

#### 2.1. 이클립스 살펴보기

파일 중에서 `eclipse.exe`파일을 더블클릭하여 실행합니다.

실행하면 다음과 같이 `workspace` 경로를 물어보는 창이 열립니다.

`workspace`란 이클립스로 관리하는 프로젝트가 저장되는 경로를 의미합니다.

앞으로 이클립스로 개발하는 모든 내용이 저장되는 폴더라고 생각하면 됩니다.

![이클립스 설치](./img/3-3-04.png)

폴더를 지정한 후 `Lanuch`버튼을 클릭하면 버전에 따라서 모양이 약간 다르지만, 로그화면이 보여지면서 실행되게 됩니다.

![이클립스 설치](./img/3-3-05.png)

처음 실행되면 이클립스 `Welcome`탭이 보여집니다.

각 링크를 클릭하면서 내용을 살펴보세요.

이클립스와 관련된 다양한 내용에 대하여 살펴볼 수 있을 것입니다.

![이클립스 설치](./img/3-3-06.png)

내용을 살펴보았다면, `Welcome` 탭의 X버튼을 클릭하여 해당 창을 닫습니다.

창을 닫으면 아래의 그림과 같은 화면이 보여집니다.

![이클립스 설치](./img/3-3-07.png)

이클립스를 다운로드 받을 때 보면, 다양한 종류의 이클립스가 있던 것을 볼 수 있었습니다.

이클립스는 `플러그인(Plugin)`이란 구조로 만들어져 있습니다.

이클립스에 다양한 플러그인을 설치함으로써 다양한 방식으로 사용할 수 있습니다.

이클립스에 아무 플러그인도 설치하지 않았다면, 빈 윈도우 화면이 보여질 것입니다.

`Eclipse IDE for Java EE Developers` 는 자바와 자바 웹 개발을 위한 플러그인들이 설치된 버전이라고 생각하면 됩니다.

(1)번 영역은 `퍼스팩티브(Perspective)`라고 합니다.

퍼스팩티브는 여러개의 뷰(View)와 에디터 영역, 메뉴 등으로 구성되어 있습니다.

우리는 자바 개발과 자바웹 개발을 위한 퍼스팩티브를 사용할 것입니다.

(2)번 영역은 `뷰(View)`라고 합니다.

이클립스는 다양한 뷰를 제공해줍니다.

파일 탐색기와 유사항 뷰부터 시작해서 서버실행화면을 보여주는 뷰 등 다양한 뷰를 제공합니다.

(3)번 영역은 `에디터(Editor)` 영역이라고 합니다.

보통 에디터가 위치하기 때문입니다. 에디터 영역에서 앞으로 JAVA코드를 작성할 것입니다.



### 3. 이클립스 설치 후 인코딩 설정하기

프로젝트 내에서 JAVA, HTML, xml등의 다양한 종류의 파일이 사용되는데 파일마다 인코딩하는 방법이 다르면 글자가 깨지는 현상이 발생합니다.

이런 문제가 발생하지 않도록 인코딩을 설정해 두는 것이 좋습니다.

이 과정에서는 `UTF-8`로 설정하도록 하겠습니다.

아래와 같이 인코딩을 설정해 주세요.

![인코딩 설정](./img/3-3-08.png)

`Window -> Preferences` 메뉴를 클릭합니다.

![인코딩 설정](./img/3-3-09.png)

Preferences 다이얼로그가 열리면, `General -> Workspace` 메뉴를 활성화하고, 하단의 `Text file encoding` 메뉴에서 `Other` 라디오버튼을 클릭하고 `UTF-8` 로 선택하고 `Apply` 버튼을 클릭합니다.

이렇게 설정하면 주로 자바 파일들에 대한 기본 인코딩이 UTF-8 로 설정됩니다.

![인코딩 설정](./img/3-3-10.png)

좌측 메뉴에서 `Web`을 활성화해주고 `CSS Files` 메뉴를 클릭하면 우측 메뉴가 바뀌는데 우측의 `Encoding` 항목에서 `UTF-8`을 선택하고 `Apply` 버튼을 눌러줍니다.

같은 방법으로 `HTML Files`, `JSP Files` 의 인코딩 설정도 바꿔줍니다.

![인코딩 설정](./img/3-3-11.png)

![인코딩 설정](./img/3-3-12.png)



### * 참고 자료

[Eclipse](https://www.eclipse.org/)

[위키피디아 Eclipse (software)](https://en.wikipedia.org/wiki/Eclipse_(software))

[위키피디아 Ecpipse (software) 번역본](https://ko.wikipedia.org/wiki/이클립스_(소프트웨어))



## 4) Hello World 컴파일하고 실행하기

### 1. 프로젝트 생성

![프로젝트 생성](./img/3-4-01.png)

`File -> New -> Project` 메뉴를 클릭합니다.

![프로젝트 생성](./img/3-4-02.png)

다이얼로그에는 다양한 종류의 프로젝트를 생성할 수 있는 마법사 기능이 있습니다.

마법사 기능이란 몇 가지 선택을 함으로써 필요한 파일들이나 폴더 등을 생성해서 편하게 프로그래밍을 할 수 있도록 도와주는 기능을 말합니다.

`Java Project`를 선택하고 `Next` 버튼을 클릭합니다.

![프로젝트 생성](./img/3-4-03.png)

먼저 프로젝트의 이름을 입력하시면 됩니다.

프로젝트의 이름은 첫 글자를 소문자로 사용하는 것이 좋습니다.

이클립스를 실행할 때 사용한 JRE 버전으로 1.8이 사용되고 있는 것을 확인할 수 있습니다.

프로젝트 이름을 입력했으면 `Finish` 버튼을 클릭해 주세요.

![프로젝트 생성](./img/3-4-04.png)

Java perspective로 바꿀지 물어보는 메시지가 나옵니다.

`Perspective`란 작업 공간을 의미합니다.

자바 프로그램을 하나 만드니까 Java perspective가 조금 더 편하겠다는 판단을 하여 Java perspective로 바꿀 것인지 물어보는 것이라고 생각하면 됩니다.

`Open Perspective` 버튼을 클릭합니다.

![프로젝트 생성](./img/3-4-05.png)

왼쪽 `Project Explorer` 영역에는 `first`라는 이름의 프로젝트가 하나 생성되었습니다.

오른쪽 상단에 두 개의 아이콘이 있습니다.

마우스를 아이콘 위에 올리면 `Java EE`와 `Java`라는 것을 확인할 수 있습니다.

이 부분이 `Perspective` 입니다.

바꾸면 메뉴 같은 게 달라져 있는 것을 확인할 수 있습니다.

`Java perspective`는 자바 애플리케이션을 만들 때 편리한 환경입니다.

![프로젝트 생성](./img/3-4-06.png)

`Java EE perspective`는 웹 애플리케이션을 만들 때 굉장히 편리한 환경을 제공해줍니다.

#### 1.1. 프로젝트 디렉토리

![프로젝트 생성](./img/3-4-07.png)

`Project Explorer`에서 생성된 `first` 프로젝트를 활성화시켜 보면 위와 같은 디렉토리를 가지고 있습니다.

콘솔 창에서 파일들을 살펴보도록 하겠습니다.

콘솔 창을  열고 workspace 경로로 이동해주세요.

![프로젝트 생성](./img/3-4-08.png)

`dir`로 파일 목록을 보면 위에서 만든 프로젝트인 `first`가 있는 것을 볼 수 있습니다.

`cd` 명령으로 `first` 프로젝트 안으로 이동합니다.

![프로젝트 생성](./img/3-4-09.png)

`tree /f` 명령을 사용하여 폴더 안에 들어있는 것들을 트리 형태로 볼 수 있습니다.

`dir`에서 각각 찾아 들어갈 수도 있지만 `tree` 명령을 통해 한눈에 확인할 수 있습니다.

`Project Explorer`에서 `src`만 보였다면 콘솔에서는 더 많은 것을 확인할 수 있습니다.

이클립스에서는 `.`으로 시작하는 파일들에 굉장히 중요한 설정들이 들어있습니다.

해당 파일을 직접 수정하거나 삭제할 경우 제대로 동작하지 않는 것을 볼 수 있습니다.

`src` 폴더에서는 작성된 소스가 저장될 때 자동으로 컴파일 되어 `bin`이라는 디렉토리로 클래스 파일이 저장됩니다.



### 2. 클래스 파일 생성

프로젝트에서 자바 클래스를 추가하겠습니다.

![클래스 파일 생성](./img/3-4-10.png)

`src` 폴더를 `Project Explorer`에서 마우스 오른쪽 버튼을 클릭한 후 `New -> Class` 메뉴를 클릭합니다.

'Hello' 클래스를 생성하겠습니다.

![클래스 파일 생성](./img/3-4-11.png)

프로젝트 이름으로 기본적으로 Package가 생성됩니다.

Java Class의 첫 글자는 대문자로 시작하는 것이 프로그래머들 사이의 약속입니다.

소문자를 썼다고 해서 에러가 발생하지는 않지만 이런 약속은 지키는 것이 좋습니다.

메인 메서드가 자동으로 만들어지게 하는 체크박스를 선택하고 `Finish` 버튼을 클릭합니다.

![클래스 파일 생성](./img/3-4-12.png)

설정했던 대로 package는 first에 만들어졌고, class 이름은 Hello로 되어있습니다.

메인 메서드를 자동으로 만들어달라고 했기 때문에 메인 메서드가 자동으로 만들어진 것을 볼 수 있습니다.

콘솔에는 어떤 파일들이 생성되었는지 확인해보겠습니다.

![클래스 파일 생성](./img/3-4-13.png)

`tree /f`명령을 통해 확인하니 `bin` 디렉토리에도 `first` 디렉토리가 생성되었고 그 안에 `Hello.class` 파일이 생성된 것을 볼 수 있습니다.

자바 문법에 맞지 않게 소스 파일을 작성했거나 컴파일이 제대로 되지 않았다면 여기에 생성되지 않을 것입니다.



### 3. 실행하기

생성된 파일을 실행해보도록 하겠습니다.

실행할 수 있는 것은 `Run` 메뉴를 이용해서 실행하면 됩니다.

![실행하기](./img/3-4-14.png)

`Run -> Run As -> Java Application` 메뉴를 클릭합니다.

메인 메서드에 아무런 코드가 없기 때문에 아무런 일도 일어나지 않습니다.

자동으로 `Hello World`문구가 출력되도록 하겠습니다.

![실행하기](./img/3-4-15.png)

메인 메서드 안에 `System.out.println("Hello World");`를 입력해줍니다.

```java
package first;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello world");
	}

}
```

저장을 반드시 해야 컴파일이 됩니다.

다시 실행할 때는 `Run` 버튼만 클릭해도 됩니다.

![실행하기](./img/3-4-16.png)

하단의 `Console`에 `Hello World`라는 문자열이 출력된 것을 확인할 수 있습니다.



### * 참고 자료

[구글 Java 코딩 컨벤션](https://google.github.io/styleguide/javaguide.html)

[자바 코딘 규칙(Java Code Conventions)](https://myeonguni.tistory.com/1596)

[Code Conventions for the Java Programming Language: Contents](http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html)



# 4. Maven

## 1) Maven 이란?

### 1. Maven이란?

`Maven`은 지금까지 애플리케이션을 개발하기 위해 반복적으로 진행해왔던 작업들을 지원하기 위하여 등장한 도구입니다. Maven을 사용하면 빌드(Build), 패키징, 문서화, 테스트와 테스트 리포팅, git, 의존성관리, svn등과 같은 형상관리서버와 연동(SCMs), 배포 등의 작업을 손쉽게 할 수 있습니다.

Maven을 이해하려면 `CoC(Convention over Configuration)`라는 단어를 먼저 이해해야 합니다. CoC란 일종의 관습을 말하는데, 예를 들자면 프로그램의 소스파일은 어떤 위치에 있어야 하고, 소스가 컴파일된 파일들은 어떤 위치에 있어야 하고 등을 미리 정해놨다는 것입니다. 이 말은 관습에 이미 익숙한 사용자는 쉽게 Maven을 사용할 수 있는데, 관습에 익숙하지 않은 사용자는 이러한 제약사항에 대해서 심한 거부감을 느낄 수 있습니다. Maven을 사용한다는 것은 어쩌면 이러한 관습 즉 CoC에 대해서 알아나가는 것이라고도 말할 수 있습니다. 



### 2. Maven을 사용할 경우 얻게 되는 이점은?

Maven을 사용할 경우, 굉장히 편리한 점들이 많습니다.

많은 사람이 손꼽는 장점 중에는 편리한 의존성 라이브러리 관리가 있습니다. JSTL을 학습할 때, 몇 가지 파일을 다운로드 하여 /WEB-INF/lib폴더에 복사하여 사용했었습니다. 관련된 라이브러리가 많아질수록 이러한 방식은 상당히 불편해집니다. Maven을 사용하면 설정 파일에 몇 줄 적어줌으로써 직접 다운로드 받거나 하는 것을 하지 않아도 라이브러리를 사용할 수 있습니다.

프로젝트에 참여하는 개발자가 많아지게 되면, 프로젝트를 빌드하는 방법에 대하여 가이드하는 것도 쉬운 일이 아닙니다. Maven을 사용하게 되면 Maven에 설정한 대로 모든 개발자가 일관된 방식으로 빌드를 수행할 수 있게 됩니다.

Maven은 또한 다양한 플러그인을 제공해줘서, 굉장히 많은 일들을 자동화시킬 수 있습니다.



### 3. Maven 기본

Archetype을 이용하여 Maven 기반 프로젝트를 생성할 경우 생성된 프로젝트 하위에 `pom.xml` 파일이 생성됩니다.

pom.xml 파일을 살펴보면 다음과 같습니다. 

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>kr.or.connect</groupId>
    <artifactId>examples</artifactId>
    <packaging>jar</packaging>
    <version>1.0-SNAPSHOT</version>
    <name>mysample</name>
    <url>http://maven.apache.org</url>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>3.8.1</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
</project>
```

각각의 태그의 의미는 다음과 같습니다.

- project : pom.xml 파일의 최상위 루트 엘리먼트(Root Element).
- modelVersion : POM model의 버전.
- groupId : 프로젝트를 생성하는 조직의 고유 아이디를 결정. 일반적으로 도메인 이름을 거꾸로 적습니다.
- artifactId : 해당 프로젝트에 의하여 생성되는 artifact의 고유 아이디를 결정. Maven을 이용하여 pom.xml을 빌드할 경우 `artifactid-version.packaging`와 같은 규칙으로 artifact가 생성됩니다. 위 예를 빌드할 경우 examples-1.0-SNAPSHOT.jar 파일이 생성됩니다.
- packaging : 해당 프로젝트를 어떤 형태로 packaging 할 것인지 결정. `jar, war, ear` 등이 해당됩니다.
- version : 프로젝트의 현재 버전. 추후 살펴보겠지만 프로젝트가 개발 중일 때는 `SNAPSHOT`을 접미사로 사용합니다. Maven의 버전 관리 기능은 라이브러리 관리를 편하게 합니다.
- name : 프로젝트의 이름.
- url : 프로젝트 사이트가 있다면 사이트 URL을 등록하는 것이 가능합니다.
- dependencies : 해당 엘리먼트 안에 필요한 라이브러리 지정. Maven을 이용할 경우 얻게 되는 큰 이점 중의 하나는 Dependency Management 기능입니다. dependencies 엘리먼트가 Dependency Management 기능의 핵심이라고 할 수 있습니다.



### * 참고 자료

[Maven - Welcome to Apache Maven](http://maven.apache.org/)



## 2) Maven을 이용한 웹 어플리케이션 실습

### 1. Maven을 이용한 웹 어플리케이션 프로젝트 생성

이클립스를 실행하고, 이클립스의 메뉴 중 `File -> New -> Project`를 선택합니다.

![Maven 프로젝트 생성](./img/4-2-01.png)

프로젝트 위자드(Wizard)가 뜨면, Maven아래의 `Maven Project`를 선택한 후 `Next` 버튼을 클릭합니다.

![Maven 프로젝트 생성](./img/4-2-02.png)

Maven프로젝트가 기존 워크스페이스 경로에 생성되도록 합니다.

`Next` 버튼을 클릭합니다.

![Maven 프로젝트 생성](./img/4-2-03.png)

아키타입(Archetype)을 선택합니다. 아키타입이란 일종의 프로젝트 템플릿(Template)이라고 말할 수 있습니다.

어떤 아키타입을 선택했느냐에 따라서 자동으로, 여러 가지 파일들을 생성하거나 라이브러리를 셋팅해주거나 등의 일을 해줍니다.

Maven을 이용하여 웹 어플리케이션을 개발하기 위해서 `maven-archetype-webapp`을 선택한 후 `Next` 버튼을 클릭합니다.

![Maven 프로젝트 생성](./img/4-2-04.png)

Group Id는 보통 프로젝트를 진행하는 회사나 팀의 도메인 이름을 거꾸로 적습니다.

Artifact Id는 해당 프로젝트의 이름을 적습니다.

버전은 보통 기본값(0.0.1-SNAPSHOT)으로 설정합니다.

package이름은 group id와 Artifact Id가 조합된 이름이 됩니다.

Group Id를 kr.or.connect이고 Artifact Id가 mavenweb으로 설정했기 때문에 package이름은 kr.or.connect.mavenweb이 됩니다.

`Finish`버튼을 클릭합니다.

![Maven 프로젝트 생성](./img/4-2-05.png)

프로젝트가 생성된 프로젝트의 디렉토리 구조입니다.

디렉토리의 구조를 보기 위해서 이클립스의 `Navigator view`를 통해서 확인하였습니다.

Maven으로 생성된 프로젝트의 경우 자바 소스는 src/main/java 폴더에 생성됩니다.

웹 어플리케이션과 관련된 html, css등은 src/main/webapp 폴더에서 작성해야 합니다.

그런데, 생성된 프로젝트를 보면 src/main/java 폴더가 보이지 않습니다.

필요한 폴더는 별도로 만들어줄 필요가 있습니다.

![Maven 프로젝트 생성](./img/4-2-06.png)



### 2. Maven을 이용한 웹 어플리케이션 프로젝트 설정

![Maven 프로젝트 설정](./img/4-2-07.png)

프로젝트를 선택하고, 우측버튼을 눌러 `Properties`를 선택합니다.

![Maven 프로젝트 설정](./img/4-2-08.png)

`Java Compiler` 메뉴를 선택합니다.

선택을 해보면 기본적으로 `JDK 1.5 버전`을 사용하는 것을 알 수 있습니다.

Maven으로 프로젝트를 생성하면 기본적으로 JDK 1.5를 사용하게 됩니다.

JDK8을 사용하도록 하려면 Maven설정 파일인 pom.xml파일을 수정해야 합니다.

`pom.xml` 파일을 더블클릭하면 다음과 같이 보입니다.

![Maven 프로젝트 설정](./img/4-2-09.png)

아래쪽의 `pom.xml` 탭을 선택하면 소스가 보입니다.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>kr.or.connect</groupId>
  <artifactId>mavenweb</artifactId>
  <packaging>war</packaging>
  <version>0.0.1-SNAPSHOT</version>
  <name>mavenweb Maven Webapp</name>
  <url>http://maven.apache.org</url>
  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
    <finalName>mavenweb</finalName>
  </build>
</project>
```

자동으로 juint 3.8.1 라이브러리를 추가하고 있습니다.

junit은 테스트를 위한 라이브러리입니다.

위의 내용에 다음의 코드를 입력합니다.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>
  <groupId>kr.or.connect</groupId>
  <artifactId>mavenweb</artifactId>
  <packaging>war</packaging>
  <version>0.0.1-SNAPSHOT</version>
  <name>mavenweb Maven Webapp</name>
  <url>http://maven.apache.org</url>

  <dependencies>
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>
  </dependencies>
  <build>
    <finalName>mavenweb</finalName>
        <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.6.1</version>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
    </plugins>
  </build>
</project>
```

코드를 입력하였으면, 저장합니다.

수정 후 다시 프로젝트 프로퍼티의 자바 컴파일러 항목을 보면 여전히 1.5 입니다.

![Maven 프로젝트 설정](./img/4-2-10.png)

프로젝트 프로퍼티를 선택한 후 Maven메뉴 아래의` Java EE Integration`을 선택합니다.

> `Java EE Integration`이 보이지 않은 경우 `Perspective`에서 `Java EE`로 변경합니다.

보이는 것처럼 `Enable Project Specific Settings` 앞의 체크박스를 선택합니다.

그리고 아래의 `Apply and Close` 버튼을 클릭합니다.

그리고, 다시 프로퍼티의 자바 컴파일러 버전을 확인하도록 하겠습니다.

`JDK 1.8`이 사용되는 것을 알 수 있습니다.

Maven의 설정을 바꾸면, 이클립스 프로젝트 설정이 연동되게 된 것입니다.



### 3. Maven을 이용한 웹 어플리케이션 프로젝트 실행

이번엔 `webapp` 폴더 아래의 `index.jsp`를 열어보도록 하겠습니다.

![Maven 프로젝트 실행](./img/4-2-11.png)

HttpServlet을 찾을 수 없다는 오류 메시지가 보입니다.

다음에 배우게 되는 웹 백엔드 프로그래밍 기초 에서는 `Dynamic Web Application`을 만들 볼텐데요. 

그 때는 WAS Runtime 설정을 하면서 `Tomcat`을 지정합니다.

Tomcat안에 있는 서블릿 라이브러리가 사용되면서 문제가 없게 됩니다.

실행시에도 WAS 위에서 실행되기 때문에 WAS의 서블릿 라이브러리를 사용하게 됩니다.

Maven프로젝트로 생성했을 경우에는 WAS 런타임이 지정을 안 했기 때문에 서블릿 라이브러리를 찾을 수 없습니다.

dependencies 엘리먼트에 다음을 추가합니다.

```xml
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>javax.servlet-api</artifactId>
        <version>3.1.0</version>
        <scope>provided</scope>
    </dependency>
```

위의 내용을 보면 scope에 `provided`라는 항목이 있는데 servlet 라이브러리를 컴파일 시에만 사용되고 배포 시에는 사용되지 않는다는 것을 의미합니다.

scope는 다음과 같은 4가지가 있습니다.

- **compile** : 컴파일 할 때 필요. 테스트 및 런타임에도 클래스 패스에 포함됩니다. scope 을 설정하지 않는 경우 기본값입니다.
- **runtime** : 런타임에 필요. JDBC 드라이버 등이 예가 됩니다. 컴파일 시에는 필요하지 않지만, 실행 시에 필요한 경우입니다.
- **provided** : 컴파일 시에 필요하지만, 실제 런타임 때에는 컨테이너 같은 것에서 제공되는 모듈. servlet, jsp api 등이 이에 해당. 배포 시 제외됩니다. 
- **test** : 테스트 코드를 컴파일 할 때 필요. 테스트 시 클래스 패스에 포함되며, 배포 시 제외됩니다.

위의 내용을 추가하고 `index.jsp`에 가보면 오류가 발생하지 않는 것을 알 수 있습니다.

![Maven 프로젝트 실행](./img/4-2-12.png)

해당 프로젝트를 실행해 보도록 하겠습니다.

프로젝트를 선택한 후 우측버튼을 클릭하여 `Run As -> Run on Server`를 선택합니다.

![Maven 프로젝트 실행](./img/4-2-13.png)

해당 웹 어플리케이션을 실행할 Runtime을 지정하고, 항상 해당 런타임을 사용하겠다는 아래쪽 체크박스도 선택한 후 `Finish` 버튼을 클릭합니다.

> Tomcat이 설치되어있지 않은 경우 미리 설치를 해야합니다.

![Maven 프로젝트 실행](./img/4-2-14.png)

브라우저가 실행되면서 index.jsp가 보여지는 것을 확인할 수 있습니다.



### 4. JSTL 라이브러리 추가

이번엔 pom.xml 파일에 JSTL 라이브러리를 추가하도록 하겠습니다.

```xml
    <dependency>
        <groupId>javax.servlet</groupId>
        <artifactId>jstl</artifactId>
        <version>1.2</version>
    </dependency>
```

위의 코드를 넣었을 때 tomcat 에러가 난다면 아래의 코드를 넣어주세요.

```xml
    <dependency>
        <groupId>org.apache.taglibs</groupId>
        <artifactId>taglibs-standard-spec</artifactId>
        <version>1.2.5</version>
    </dependency>
    <dependency>
        <groupId>org.apache.taglibs</groupId>
        <artifactId>taglibs-standard-impl</artifactId>
        <version>1.2.5</version>
    </dependency>
```



JSTL은 Tomcat이 기본으로 제공하지 않기 때문에, 컴파일할 때도 배포할 때도 사용돼야 합니다.

그래서 scope에 이번엔 provided가 있지 않습니다.

`webapp` 폴더에 jstl02.jsp를 만들고 다음 코드를 붙여넣기 하도록 하겠습니다.

```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%
request.setAttribute("n", 10);
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="${n == 0}">
n은 과 0과 같습니다.
</c:if>

<c:if test="${n == 10}">
n은 과 10과 같습니다.
</c:if>
</body>
</html>
```

라이브러리가 변경되었으니, 다시 run on server를 합니다.

실행해도 결과가 아무것도 나오지 않는 것을 확인할 수 있습니다.

프로젝트 프로퍼티를 선택한 후, `Project facets` 항목을 보면 다이나믹 웹 모듈의 버전이 2.3입니다.

다이나믹 웹 모듈의 2.4부터 EL이 기본으로 사용할 수 있도록 설정되기 때문에 2.3일 경우에는 EL표기법의 결과가 출력되지 않습니다.

앞의 프로젝트처럼 다이나믹 웹 모듈 3.1이 되도록 설정해보도록 하겠습니다.

먼저 WEB-INF의 `web.xml` 파일을 열어보도록 하겠습니다.

```xml
<!DOCTYPE web-app PUBLIC
 "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
 "http://java.sun.com/dtd/web-app_2_3.dtd" >

<web-app>
  <display-name>Archetype Created Web Application</display-name>
</web-app>
```

위의 내용을 다음과 같이 수정합니다.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" version="3.1">
  <display-name>Archetype Created Web Application</display-name>
</web-app>
```

프로젝트아래의 `.settings/org.eclipse.wst.common.project.facet.core.xml` 파일을 엽니다.

`Windows > Show veiw > Navigator`로 파일을 보면 .settings 파일을 발견할 수 있습니다.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<faceted-project>
  <fixed facet="wst.jsdt.web"/>
  <installed facet="jst.web" version="2.3"/>
  <installed facet="wst.jsdt.web" version="1.0"/>
  <installed facet="java" version="1.8"/>
</faceted-project>
```

위의 내용을 다음과 같이 수정합니다.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<faceted-project>
  <fixed facet="wst.jsdt.web"/>
  <installed facet="jst.web" version="3.1"/>
  <installed facet="wst.jsdt.web" version="1.0"/>
  <installed facet="java" version="1.8"/>
</faceted-project>
```

프로젝트 프로퍼티의 `Project facets`항목을 보면 다이나믹 웹 모듈이 3.1로 바뀐 것을 볼 수 있습니다.

이제 `jstl02.jsp`를 `run on server`로 실행합니다.

실행을 하지만 오류가 나면서 실행이 안 되는 경우가 있을 수 있습니다.

이클립스의 버그로, 수정되기 전의 데이터와 수정된 데이터가 섞여서 실행되기 때문입니다.

이 경우 웹 어플리케이션을 깔끔히 초기화하고 실행하는 것이 좋을 수 있습니다.

1. 기존 tomcat을 종료합니다.
2. 혹시 바뀌지 않았다면 프로젝트를 선택하고, 우측버튼을 눌러서 `Maven -> update project`를 선택한 후 확인하세요.
3. Servers view에서 기존 Tomcat Runtime을 삭제
4. `Project -> Clean`선택
5. 프로젝트 익스플로러에서 Server 삭제

위와 같은 과정을 거친 후 `Run on Server`로 실행해보세요.

결과가 잘 나오는 것을 확인할 수 있습니다.

지금까지 배웠던 내용 중에서 가장 복잡한 것 같은데요.

다이나믹 웹 모듈을 2.3에서 3.1로 바꾸는 것은 프로젝트가 한번 만들어지면, 그 이후부터는 그 프로젝트가 더 이상 사용되지 않을 때까지 계속 사용되기 때문에 자주 개발자가 해야 할 일은 아닙니다.

그 이후부터는 pom.xml에 원하는 기능을 추가하면서 개발을 진행하면 됩니다.



### * 참고 자료

[How to Create Dynamic Web Project using Maven in Eclipse?](https://crunchify.com/how-to-create-dynamic-web-project-using-maven-in-eclipse/)

[How to fix Cannot change version of project facet Dynamic Web Module to 3.0 Error in Eclipse](https://crunchify.com/how-to-fix-cannot-change-version-of-project-facet-dynamic-web-module-to-3-0-error-in-eclipse/)

[Maven in 5 Minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)



# 5. JDBC

## 1) JDBC란?

### 1. JDBC 개요

- **JDBC(Java Database Connectivity)**의 정의
  - 자바를 이용한 데이터베이스 접속과 SQL 문장의 실행, 그리고 실행 결과로 얻어진 데이터의 핸들링을 제공하는 방법과 절차에 관한 규약
  - 자바 프로그램 내에서 SQL문을 실행하기 위한 자바 API
  - SQL과 프로그래밍 언어의 통합 접근 중 한 형태
- JAVA는 표준 인터페이스인 JDBC API를 제공
- 데이터베이스 벤더, 또는 기타 써드파티에서는 JDBC 인터페이스를 구현한 드라이버(driver)를 제공한다.



### 2. JDBC 환경 구성

- JDK 설치
- JDBC 드라이버 설치
  - Maven에 다음과 같은 의존성을 추가합니다.

```xml
<dependency>   
  <groupId>mysql</groupId>   
       <artifactId>mysql-connector-java</artifactId>
       <version>5.1.45</version>
 </dependency>
```



### 3. JDBC 클래스의 생성 관계

![JDBC 클래스의 생성 관계](./img/5-1-01.png)



### 4. JDBC를 이용한 프로그래밍 방법

1. **IMPORT**

   ```java
   import java.sql.*;
   ```

   - DriverManager, Connection, Statement 인터페이스

2. **드라이버 로드**

   ```java
   Class.forName( "com.mysql.jdbc.Driver" );
   ```

   - **Class**라는 클래스가 갖고 있는 **forName** 메서드를 이용하면 객체가 메모리에 올라갑니다.

3. **Connection 얻기**

   ```java
   String dburl  = "jdbc:mysql://localhost/dbName";
   
   Connection con =  DriverManager.getConnection ( dburl, ID, PWD );
   ```

   - **Connection** 객체를 얻기 위해 **DriverManager** 객체를 사용합니다.
   - 데이터베이스의 `url, user, password` 정보를 알려줘야 합니다.
   - 소스코드 예제

   ``` java
   public static Connection getConnection() throws Exception{
   	String url = "jdbc:oracle:thin:@117.16.46.111:1521:xe";
   	String user = "smu";
   	String password = "smu";
   	Connection conn = null;
   	Class.forName("oracle.jdbc.driver.OracleDriver");
   	conn = DriverManager.getConnection(url, user, password);
   	return conn;
   }
   ```

4. **Statement 객체 생성**

   ```java
   Statement stmt = con.createStatement();
   ```

   - 쿼리를 사용하기 위해 **Statement** 객체를 얻어야 합니다.
   - **Connection**을 이용하여 **Statement**를 얻어냅니다.

5. **질의 수행**

   ```java
   ResultSet rs = stmt.executeQuery("select no from user" );
   
   //참고
   stmt.execute(“query”);             //any SQL
   stmt.executeQuery(“query”);     //SELECT
   stmt.executeUpdate(“query”);   //INSERT, UPDATE, DELETE
   ```

   - **Statement** 객체에 쿼리문을 작성합니다.

6. **ResultSet으로 결과 받기**

   ```java
   ResultSet rs =  stmt.executeQuery( "select no from user" );
   while ( rs.next() )
         System.out.println( rs.getInt("no"));
   ```

   - 결과 셋은 데이터베이스가 가지고 있고, 결과 셋을 가리키는 레퍼런스 변수만 받았습니다.
   - 데이터를 한꺼번에 가져오는 것이 아니라 첫번째 레코드부터 하나씩 꺼내옵니다.
   - `getInt("no")` : 컬럼명이 'no'인 컬럼의 값 가져오기

7. **Close**

   - 객체를 반대 순서로 모두 닫아야 합니다.

   ```java
   rs.close();
   
   stmt.close();
   
   con.close();
   ```



### 5. 소스코드 예제

- 예제1

```java
public List<GuestBookVO> getGuestBookList(){
		List<GuestBookVO> list = new ArrayList<>();
		GuestBookVO vo = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try{
			conn = DBUtil.getConnection();
			String sql = "select * from guestbook";	// guestbook 테이블에 있는 모든 데이터 가져오기
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				vo = new GuestBookVO();
				vo.setNo(rs.getInt(1));
				vo.setId(rs.getString(2));
				vo.setTitle(rs.getString(3));
				vo.setConetnt(rs.getString(4));
				vo.setRegDate(rs.getString(5));
				list.add(vo);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps, rs);
		}		
		return list;		
}
```

- 예제2

```java
public int addGuestBook(GuestBookVO vo){
		int result = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn = DBUtil.getConnection();
			String sql = "insert into guestbook values("
					+ "guestbook_seq.nextval,?,?,?,sysdate)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getTitle());
			ps.setString(3, vo.getConetnt());
			result = ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			DBUtil.close(conn, ps);
		}
		
		return result;
}
```

- 예제3

```java
public static void close(Connection conn, PreparedStatement ps){
		if (ps != null) {
			try {
				ps.close();
			} catch (SQLException e) {e.printStackTrace(); }
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {e.printStackTrace();}
		}
}
```

- 프레임워크를 사용하면 반복적으로 해야하는 작업을 알아서 실행시켜줍니다.



### * 참고 자료

[Java API Reference](https://docs.oracle.com/javase/8/docs/api/)

[JDBC Tutorial](https://docs.oracle.com/javase/tutorial/jdbc/basics/index.html)



## 2) JDBC 실습

### 1. 실습1

#### 1.1. Maven 프로젝트 생성

`File -> New -> Maven Project` 메뉴를 클릭합니다.

![JDBC 실습1](./img/5-2-01.png)

`Next` 버튼을 클릭합니다.

![JDBC 실습1](./img/5-2-02.png)

`quickstart` 선택 후 `Next` 버튼을 클릭합니다.

![JDBC 실습1](./img/5-2-03.png)

`Group Id, Artifact Id` 작성 후 `Finish` 버튼을 클릭합니다.

#### 1.2. pom.xml

`JDK 1.8` 버전 사용을 위해 plugin을 추가하고, `JDBC 드라이버`를 사용하기 위해 `Dependency`에 추가합니다.

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>

	<groupId>kr.or.connect</groupId>
	<artifactId>jdbcexam</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>jar</packaging>

	<name>jdbcexam</name>
	<url>http://maven.apache.org</url>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	</properties>

	<dependencies>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>5.1.45</version>
		</dependency>
		<dependency>
			<groupId>junit</groupId>
			<artifactId>junit</artifactId>
			<version>3.8.1</version>
			<scope>test</scope>
		</dependency>
	</dependencies>
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-compiler-plugin</artifactId>
				<version>3.6.1</version>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>
```

프로젝트 우클릭 후 `Maven -> Update Project`를 해줍니다.

#### 1.3. 데이터를 저장할 수 있는 객체 생성 - Role.java

![JDBC 실습1](./img/5-2-04.png)

`src/main/java -> kr.or.connect.jdbcexam` 우클릭 후 `New -> Class` 메뉴를 선택합니다.

![JDBC 실습1](./img/5-2-05.png)

관련있는 클래스끼리 같은 패키지에 묶기 위해 `dto` 패키지를 만듭니다.

클래스명을 작성하고 `Finish` 버튼을 클릭합니다.

```java
private Integer roleId;
private String description;
```

Integer 타입의 **roleId**, String 타입의 **description**을 만들어줍니다.

데이터를 꺼내고 넣는 작업을 수행하기 위해 **getter, setter** 메서드를 생성합니다.

`Source -> Generate Getters and Setters` 메뉴를 클릭합니다.

![JDBC 실습1](./img/5-2-06.png)

`Select All`을 클릭한 후 `OK` 버튼을 클릭합니다.

![JDBC 실습1](./img/5-2-07.png)

객체 안에 들어있는 값들을 편하게 출력할 수 있도록 toString() 메서드를 사용합니다.

`Source -> Generate toString()` 메뉴를 클릭합니다.

![JDBC 실습1](./img/5-2-08.png)

`OK` 버튼을 클릭합니다.

![JDBC 실습1](./img/5-2-09.png)

객체를 생성할 때 편하게 하기 위해 생성자를 추가합니다.

인자를 받아 각각에 담아주는 생성자도 추가합니다.

```java
public Role() {

}

public Role(Integer roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
}
```

`Source -> Generate Constructor using Fields` 메뉴를 통해서 쉽게 만들 수 있습니다.

- Role.java

```java
package kr.or.connect.jdbcexam.dto;

public class Role {
	private Integer roleId;
	private String description;

	public Role() {

	}

	public Role(Integer roleId, String description) {
		super();
		this.roleId = roleId;
		this.description = description;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", description=" + description + "]";
	}
}
```

#### 1.4. 입력, 조회, 수정, 삭제하는 클래스 생성 - RoleDao.java

`src/main/java -> kr.or.connect.jdbcexam` 우클릭 후 `New -> Class` 메뉴를 선택합니다.

![JDBC 실습1](./img/5-2-10.png)

`dao`패키지에 `RoleDao` 클래스를 생성합니다.

먼저 데이터를 한 건 가져오는 메서드를 추가하겠습니다.

한 건에 대한 정보를 담아낼 객체가 `Role`이기 때문에 role을 리턴하도록 만들어줍니다.

`role_id`를 받아서 정보를 가져오도록 하겠습니다.

```java
public class RoleDao {
	public Role getRole(Integer roldId) {
		Role role = null;
		
		return role;
	}
}
```

