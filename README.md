# HELBLY
# 1. 들어가기 전에.

## 프로젝트에서 가장 중요한것.

* 중복은 최소화하자 - 1번이상 같은것이 겹친다면 그것은 공통 함수로 만들어주세요.
* 프로젝트는 팀단위 개발 이다 - 프로젝트에 있어 팀원간 작업방식을 통일해주세요.
* 개발보다 유지보수가 훨씬 빡세다 - 빨리빨리 x -> 팀원들을 위해 최대한 견고하게 만들어주세요.

# 2. 프로젝트 feedBack.

## 1. readme 작성은 필수
### readMe 란?
`readme` 란 일종의 프로젝트 설명서로 해당 프로젝트의 구성, 사용기술, 프로젝트 설명, 프로젝트 설치 및 실행과 프로젝트 코딩 가이드가 서술되어있어야 한다. 이는 협업에 있어 필수 요소 입니다. 

간단예시 : https://github.com/sunginHwang/mr.H


## 2. 프로젝트 폴더 구성은 통일하여야 합니다. (필수)
![](https://images.velog.io/images/gommpo/post/83ac038d-cc4e-430b-837b-2e5698960df9/image.png)

`controller` 만 따로 폴더로 구성을 안하게 되니 이렇게 지저분한 케이스 발생.

## 3. 네이밍은 서로의 약속 
각 언어별 관행처럼 사용하는 네이밍 규칙이 존재합니다. 자바의 경우 클래스이름은 `파스칼케이스(TestCase)`, 나머지는 `카멜케이스(testCase)`, 상수의 경우 `대문자와 _ 의 조합 (TEST_CASE)` 로 작성합니다. 이는 반드시 지켜주는것이 좋습니다. (팀간 컨벤션을 정한 경우 제외)
 
 ## 4. 코딩의 절반은 이름짓기 입니다.
 ![](https://images.velog.io/images/gommpo/post/bd3e2aa4-a32d-4cda-81ec-7b4329e29842/image.png)
 
 mapper?... 사용하는 입장에서는 이게 무슨 매퍼인지 위에가서 보기까지 전혀 알 방법이 없습니다. 코드가 복잡할수록 이는 크나큰 단점이 됩니다. 최대한 자세하게 변수를 작성하는것이 좋습니다.`memberMapper` 같이 알수있도록 적어주세요
 
 ![](https://images.velog.io/images/gommpo/post/16509c6a-6586-4575-a4a0-4aebf8eeb72f/image.png)
 협업하는 입장 + 본인이 나중에 보게되면 `RBoard` 라는게 무엇인지 정말 알기 힘이듭니다. 길더라도 이해할수 있는 네이밍으로 지어주어야 유지보수가 좋아지게 됩니다.
 
 
 ## 5. 쓰지 않는 것들은 지워주세요.
 ![](https://images.velog.io/images/gommpo/post/f7f6cdee-9081-4f84-8e8b-f85c5c024137/image.png)
 사소하지만 최적화의 문제 + 복잡도를 줄이기 위해 안쓰는 의존성은 없애주셔야 합니다.
 
 ![](https://images.velog.io/images/gommpo/post/8cce809a-6320-4d73-bd65-851ce08cd2fa/image.png)
 이런 경우는 협업하는 입장에서 쓰지는 않는데 무슨 의도로 놔둔거지?.. 하고 지우기도 망설여 지고 이는 게속 축적되어 유지보수만 힘들어지는 사태가 발생합니다. 쓰지 않는다면 과감히 지워주세요 우리에겐 git이 있으니까요.~
 
 
 ## 6. 사용하는것은 통일하는것이 좋습니다.
 ![](https://images.velog.io/images/gommpo/post/033a8855-6d6e-49f0-a82f-369009216836/image.png)
 
 면접관 입장에서는 이런 코드를 보면 바로 생각나는건 이사람이 DB매핑하는 이해도가 현저히 적고 블로그 복붙이구나 로 판단할 가능성이 거의 100%라고 확신합니다. 같은 DB 매핑의 방법을 너무 다르게 중구난방으로 쓰기때문인데 이부분은 통일하는 것이 좋습니다. 또한 오늘날의 자바는 xml 을 없애는데 주력하기 때문에 왼쪽의 방법으로 쓰는것을 추천드립니다.
 
 ## 7. 잘못된 부분은 즉각 수정해주어야 합니다.
 ![](https://images.velog.io/images/gommpo/post/50287bfe-7e8a-4798-ae04-124586338062/image.png)
 존재하지 않는 경로에 대한 스캔을 놔두는건 면접관 입장에서는 복붙의 흔적으로 의심하기 충분합니다. 복붙이 나쁜건 아니지만 자기것으로 만드는것은 되어야 하기때문입니다.
 
 ## 8. 최상단의 폴더는 최대한 공통적인 부분으로 놔두는것이 좋습니다.
 ![](https://images.velog.io/images/gommpo/post/72fa591b-6b6f-4bcb-a641-81726e629360/image.png)
 page 라고 하면 보통 홈페이지의 페이지 단위를 떠올리기 마련입니다. 이런 작업은 서비스 폴더쪽에 들어가는것이 훨씬 보기 좋아집니다.
 
 
 ## 9. url 매핑은 컨트롤러부터 시작되어야 합니다.(필수)
![](https://images.velog.io/images/gommpo/post/e7080a56-f098-49b5-b3e0-4c2ce44066ca/image.png)

위와 같이 설정하게되면 해당 `/goodsIndex` 경로를 찾기 위해 모든 컨트롤러를 뒤저야 하는 불편함이 생기게 됩니다.
![](https://images.velog.io/images/gommpo/post/5496ec64-e537-4de8-8612-b3fd5c655c0d/image.png)

아래처럼 컨트롤러 단위로 설정하면 `/specialPriceReserve` 로 시작되는 모든 매핑은 해당 컨트롤러에서 처리하는것을 알게 됩니다. 이는 반드시..! 설정해주세요. 

## 9-2.REST-API 규칙에 맞는 경로로 만들어주세요.(필수)
`삭제, 조회, 생성, 수정`에 대한 정보는 *HTTP Methods* 로 표현하고 url 로 이를 설명해주는 형식이 되어야 합니다.

### httpMethod
* GET : 조회
* POST : 생성
* PUT, PATCH : 수정
* DELETE : 삭제

### example (게시판)
* 게시판 리스트 조회: httpMethod: GET, url : /boards
* 게시판 생성: httpMethod: POST, url : /boards/save
* 게시판 1번 삭제: httpMethod: DELETE, url : /boards/1
* 게시판 1번 수정: httpMethod: PUT, url : /boards/1
* 게시판 1번 조회: httpMethod: GET, url : /boards/1


## 10. 경로는 프로젝트 기준에서 절대경로가 되어야 합니다.
![](https://images.velog.io/images/gommpo/post/72417a9f-0a74-49de-9e93-0e499d19fe47/image.png)

프로젝트가 실제 서비스 하게 된다면 리눅스 or 유닉스에 배포가 되어야 하는데 절대경로로 설정되어있기 때문에 만든 사람이 아니면 모든 사람이 사용할수 없는 불상사가 발생합니다.

```java
private static final string filePath = "/main/webapp/resourses/img";
```
가 좋습니다.

 
## 11. 코딩 컨벤션은 맞추어 주세요.
![](https://images.velog.io/images/gommpo/post/62565f4e-d71c-4fc5-8c89-aea840339183/image.png)
코드의 기본은 가독성입니다. 이를 위해 코딩 컨벤션을 맞추어 이쁘게 작성해주어야 합니다.

## 12. 매핑은 통일해주세요.
![](https://images.velog.io/images/gommpo/post/93700385-6981-4e81-b359-3d7ec030e189/image.png)

전자로 통일해주시는것이 가독성 면에서 훨씬 좋습니다. (이후 나온 기능)


## 13. DB 연결정보, sns 토큰 정보등 외부 보안 파일은 별도로 빼주세요. (필수)

![](https://images.velog.io/images/gommpo/post/50aa2dbf-c183-412e-a503-dcc563eb301d/image.png)
 
 실제 서비스는 develop, QA, STG, PROD 등 여러 환경이 있고 환경마다 계정정보등은 다를수 있습니다. 또한 코드내에 정보가 그대로 들어있으면 코드 탈취를 당하게 되면 이는 곳 서비스정보를 갈취당할수 있게 됩니다.
 
 ```xml
 <!-- HikariCP connection pool bean 셋팅-->
    <bean id="hikariConfig" class="com.zaxxer.hikari.HikariConfig">
        <!--<property name="driverClassName" value="org.mariadb.jdbc.Driver"></property>-->
        <!--<property name="jdbcUrl" value="jdbc:mariadb://127.0.0.1:3306/test"></property>-->
        <property name="driverClassName" value="${hikcariConfig.driverClassName}"></property>
        <property name="jdbcUrl" value="${hikariConfig.jdbcUrl}"></property>
        <property name="username" value="${hikariConfig.username}"></property>
        <property name="password" value="${hikariConfig.password}"></property>
    </bean>
```
위와같이 설정파일은 별도 처리 해주세요. (사실 로그에는.. 설정해두신게 있습니다.)

## 14. xml 설정은 빼주시는게 좋습니다. (권고사항)
최근 JAVA의 추세는 xml 파일 설정을 빼고있는 추세입니다. 전부 Java로만 관리하기 위함이죠. 이는 보는사람입장에서도 훨씬 깔끔하고 읽기 쉽게 됩니다. 현재 세팅된 정보의 경우 모두 JAVA 로 전환이 가능합니다. 다만 이는 권고사항 정도입니다.

## 15. js파일은 body태그 아래. style 태그는 head태그에 위치 시켜주세요.

html 파일은 파일을 위에서 아래로 읽습니다. style태그가 아래 있다면 html 태그가 먼저보이고 스타일이 씌워지기 때문에 잠시 스타일이 깨져보이게 됩니다. 상대적으로 스크립트 파일은 하단에 위치시켜 주도록 합니다. (dom을 그리는게 최우선이기때문)

## 16. 같은 부분을 쓰는 부분은 tiles 를 도입해서 최적화 해보세요.
![](https://images.velog.io/images/gommpo/post/f14f67d0-a2f1-476a-8a33-b3cfc4523ba4/image.png)
아래와 같이 공용으로 쓰는 헤더 푸터 같은 경우 `tiles` 를 사용한다면 한번만 선언해주면 되기때문에 매번 페이지마다 복붙하는 것을 없애줄 수 있습니다.

## 17. 테스트 케이스는 선택이 아닌 필수 입니다.
Controller 까지 테스트 하는 통합테스트는 아니여도 간단한 서비스에 대한 unit 테스트는 필수 입니다. 테스트케이스는 꼭 만들어 주세요. 또한 `TDD` 라는 개념은 반드시 알고 있으셔야 합니다. 테스트는 내 코드의 대한 실행 보장을 해주는 보증수표같은 존재입니다.
(일부 시연)

## 18. 코드리뷰는 꼭 해주세요.
본인이 작업하면서 알지 못했던 버그 혹은 잘못 작성한 부분 + 개선점이 보이는 부분을 다른 팀원들이 코드를 보고 조언할수 있도록 코드리뷰하는 문화가 필요합니다. 이는 본인에게도 팀원에게도 프로그램 완성도면에서도 전부 득이되는 방법론 입니다.

## 19. 패턴 사용
예를들어 해당 프로젝트의 게시판이 각 목적에 따라 여러개인경우 (자유게시판, xx 게시판) `전략패턴` 을 사용해서 작업하였다면 훨씬 이점이 될수 있습니다. 이러한 패턴들을 아래 설명드릴 예정 입니다.
 
# 3. 면접을 위해선

## 1. 포트폴리오 프로젝트에 대해선 빠삭해야 한다.

대다수의 면접관은(90% 이상) 포트폴리오를 실제로 돌려보지 않습니다. 코드만 대충 훓어보는데 이미 이시점에 물어볼 내용들이 정리가 됩니다. 결국 질문에서는 대부분 mybatis 쓰셨는데 어떤점이 힘드셨고 어떤 방법으로 풀었나요. 이런식으로 물어보게 됩니다. 때문에 해당 기술에 대한 기본적인 지식은 필수입니다.

## 2. 얼버무려 대답하면 안됩니다.
예를 들어 `interface` 에 대해 설명해달라고 할 경우 공통으로 뺄때 장점이 있어요. 라는식으로 애매하게 대답하게 되면 면접관입장에서는 해당 기술에 대해 정확히 알고있는지 검증하기 위해 더욱 자세하게 게속 물어볼것입니다. 때문에 정확하게 대답하는 것이 중요합니다.

## 3. 프로젝트가 능사가 아니다.
위의 1번과 비슷한 이유인데 프로젝트는 단순히 여러분 스펙의 일부 가점 요소가 될뿐이지 전부는 아닙니다. 때문에 아래 설명 드릴 기술셋 정도에 대해서는 필수적으로 아시고 있는것이 좋습니다.

## 4. SI vs SM
si와 sm이란 간단하게 말하면 다음과 같습니다.
* si: 의뢰받은 서비스 제작 (거의 용병..?)
* sm: 본인의 서비스가 존재하여 해당 서비스 개발 및 유지업체 

회사 선택시 본인의 서비스가 없이 외주 위주의 SI 인력 파견업체는 반드시 피해주세요. + 파견에서 자신의 경력을 3년차로 속이고 들어가게 하려는 업체는 반드시 피하셔야 합니다. 


## 5. github계정은 곧 자신의 이력서가 될수 있다.
![](https://images.velog.io/images/gommpo/post/5bb2c692-b031-4ce6-a61f-8344e688b9cc/image.png)

## 6. git을 통한 협엽하는 실무능력을 길러보자
자 이제부터 실무를 체험해보려 합니다.

* PR 체험
* 이슈 생성

## 7. 면접을 위한 알고리즘 학습
소규모 회사에서는 대부분 상관없을지 모르지만 좋은 회사일수록 알고리즘 코딩테스트를 필수적으로 보게 됩니다. 이를 연습하고 싶으시면 `백준` https://www.acmicpc.net/ 에서 충분히 연습 및 공부를 하실수 있습니다. 본인을 위해서 꼭 해보세요.


## 8. 자주 물어볼수 있는 질문들
* 싱글톤 패턴 
* 전략 패턴
* 템플릿 메소드 패턴
* git 기본 사용 방법
* 객체지향에 대해서 설명하시오
* overLoading 과 overriding 에 대해 설명하시오
* JVM 에 대해서 자세히 설명해주세요.
* 가비지 컬렉터에 대해 설명해주세요.
* interface 와 abstract 는 서로 어떻게 다르며 각각 어느경우 사용하나요?
* Call by Refetence, Call by value 에 대해 설명해주세요.
* final 은 언제 사용하나요?
* primitiveType 과 ReferenceType 은 어떻게 다를까요?
* 쓰레드 와 프로세스에 대해 설명해주세요.
* string 과 stringbuffer 는 무엇이 다른가요?
* 스택과 힙에 대해 설명해주세요.
* 제네릭 타입에 대해 설명해주세요.
* AOP 에 대해 설명해주세요
* DI 에 대해 설명해주세요
* 스프링 구동방식을 설명해 주세요.
* https://velog.io/@sparkbosing/Java-%EB%A9%B4%EC%A0%91-%EC%A0%95%EB%A6%AC
* restful-api
* SOLID  (객체지향 5대 개념)


## 9. 추천 도서
* cleanCode : http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9788966260959&orderClick=LAG&Kc=
* 디자인 패턴 : 
* 리팩터링 : (http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9791162242742&orderClick=LEa&Kc=)
* 테스트 주도 개발 : http://www.kyobobook.co.kr/product/detailViewKor.laf?ejkGb=KOR&mallGb=KOR&barcode=9788966261024&orderClick=LAG&Kc=
* 자바 8 인 액션

# 4. 이제부터 공부해야할것들
## 스프링부트 (필수)
스프링부트는 스프링초기설정이 너무 많은 진입장벽을 자동으로 해결해주고 + 자체 was 포함으로 따로 톰캣도 설치 안해도 되는 아주 편리한 친구입니다. 또한 zeroConfigration 을 목표로 하고 있으며 xml이 아닌 java 로만 처리할수 있는 좀더 편하게 스프링을 접하는 친구로 꼭 접해보시기 바랍니다.

## JPA
ORM 을 SPRING 에서 지원하는 친구이며 DB쿼리를 자동으로 매칭해 주는 친구로 잘못쓰면 역효과가 나지만 추후 꼭 알고 있어야 하는 친구입니다.

## 정보처리기사
여러분이 전공생과 비교해 약한 부분인 컴퓨터일반, 논리회로, 네트워크계층에 대해 알아갈수 있는 좋은 기회입니다. 자격증을 딸 자격이 안되도 먼저 공부해 보세요. 반드시 본인에게 도움이 됩니다.

## 디자인 패턴 (필수)
위에 언급드린 디자인 패턴들은 반드시 학습하고 있으셔야 기틀이 될 수 있습니다.

## 깔끔하게 코드 작성하기
코드를 남이 보았을때 바로 이해가 되는 코드가 최고의 코드입니다. 이를 위해 위에 언급한 리팩터링, 클린코드를 보며 코드를 깔끔하게 짜보도록 합니다.

## JAVA8 그리고 람다.
여태까지 여러분들이 작성한 코드방법은 JAVA 버전 7때의 기초하는 코드입니다. JAVA8부터 지원하는 람다라는 개념을 접하게 되면 다음과 같이 훨씬 간결한 코드 작성이 가능합니다.
```js
const datas = [{
  name: 'sungin',
  age: 12,
  sex: 'male'
},{
  name: '시윤',
  age: 20,
  sex: 'male'
},{
  name: '혜진',
  age: 15,
  sex: 'female'
}];

let resultOne = [];
// 나이가 12살이 넘은 사람의 성별들을 구하라
for(var i=0; i<datas.length; i++) {
   if(datas[i].age > 12) {
    resultOne.push(datas[i].sex);
  }
}

const result = datas.filter(data => data.age > 12).map(d => d.sex);
```

## testCase 작성
테스트케이스를 작성하는 습관을 들여야 좋은 개발자로 거듭날 수 있습니다.


# 5. 여러분들에게 드리는 말씀 

## 게시판을 혼자서 만들어보세요.
springBoot + mybatis 의 조합으로 혼자서 게시판을 만들어 보세요. 인터넷을 보며 참조하고 보셔도 좋습니다. 다만 내가 짠코드에 대해서 이해하고 넘어가세요. 그렇게 반복적으로 만들다 보면 어느순간 이해도가 수직상승 합니다.

## 본인의 블로그를 운영해보세요.
본인의 블로그를 아무곳에서 개설 후 공부한 내용을 한개씩 올려보세요. 남들에게 공유되는 내용이니 만큼 더욱 자세하게 공부할수 있고 이를 글로적으면서 이해도가 훨씬 상승하게 됩니다.

## 각종 컨퍼런스 참석
각종 개발 컨퍼런스 참석은 본인의 개발 공부 동기 부여, 최신 개발 트랜드 동향, 더 향상된 코드 방법론 등 여러면에서 본인에게 큰 도움이 됩니다. 

* 스프링 캠프
* 카카오 개발자 컨퍼런스
* 네이버 개발자 컨퍼런스
등등..


## 로컬에서만 돌려보지말고 실제 도메인을 생성하여 배포해보세요.
실서비스를 실제로 배포하고 말고의 경험차이는 이루 말할 수 없습니다. 이는 꼭 한번 시도해보세요.

## 스터디는 별로 추천하지 않습니다.
저도 학부생, 신입~2년차까지 일년에 최소 5개 이상의 스터디를 다녀보았으나 현재 단 하나도 진행하지 않습니다. 보통 3주차 이상 지나면 형식적인 만남과 도움도 안되는 시간 + 돈의 낭비입니다. 스터디에서는 그 누구도 제대로 알려주지 않습니다. 누군가에게 배우기 위해 스터디를 들어가시면 오히려 실망감만 커집니다. 혼자 위에 말씀드린 게시판을 만들어보시는것이 훨씬 도움이 됩니다. (경험담이에요.)

## 신입에게 기대하는 수준이 어디까지인가요?
SI업체가 아닌 이상 신입에게 애초에 커다란 기능 같은 작업을 맡기는 경우는 거의 없습니다. 개발팀의 입장에서 신입에게 물론 업무는 주지만 해당 기능이 서비스에 큰 지장이 되는것도 아니고 쉬운것부터 적응하기 쉽게 분담해주는게 일반입니다. 물론 공부도 충분히 시켜주게 됩니다. 너무 큰 걱정은 안하셔도 됩니다.~

## 회사에 들어가서 무엇을 따로 공부하면 될까요?
위에 말씀드린 기술 스펙에 대해서만 공부하셔도 충분히 많은 도움이 됩니다. + 업무에 도움이 빠르게 되고 싶다면 일단 회사 서비스를 들어가서 천천히 뜯어보세요. 그리고 프로젝트 url 매핑에 따른 컨트롤러부터 한줄한줄 자세히 살펴 보며 분석해보세요 이는 업무파악에 큰 도움이 됩니다.( 이를 리버스 엔지니어링의 일부라고 볼 수 있습니다)

## 신입으로 들어가서 아무것도 못할까봐 걱정이에요..
본인만 그런것이 아닙니다.~ 
![](https://images.velog.io/images/gommpo/post/94bda956-5fb8-4331-ab3f-e66c98fc8ef1/image.png)
![](https://images.velog.io/images/gommpo/post/532bb7d1-a06b-42e3-8e20-7b692f147ce9/image.png)
