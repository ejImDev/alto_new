🔗시현 영상 (임은진 구현 페이지)<br>
[![Video Label](http://img.youtube.com/vi/kpr6VfRPj0c/0.jpg)](https://youtu.be/kpr6VfRPj0c)<br>https://youtu.be/kpr6VfRPj0c<br><br>

✈️ 소개
ALTO는 취미생활을 주제로 한 모임 커뮤니티 및 클래스 수강 기능을 가지고 있습니다.<br> Alone-Together의 약자이며 취미 생활을 하고자 하는 개인을 대상으로 서비스를 제공합니다.<br><br>

🛠 기능 요약
이용자가 취미 생활을 하기 위해 원하는 카테고리의 취미 생활을 찾아 볼 수있고,<br>
주제나 지역이 맞는 이용자들끼리 모임을 가지거나 함께 취미생활을 배울 수 있는 커뮤니티 기능을 가집니다.<br>
더불어 원하는 취미 생활에 필요한 취미용품 등을 구입하는 쇼핑몰의 기능도 갖추고 있습니다.<br><br>

⏰ 개발 기간<br>
1️⃣차 프로젝트 : 2022년 7월 1일 ~ 2022년 8월 25일<br>
2️⃣차 프로젝트 : 2022년 8월 26일 ~ 2022년 8월 18일<br><br>

👩‍💻 멤버 구성<br>
김지선, 임은진<br><br>

👩‍💻 담당 파트 (임은진)<br>
- 담당 페이지 프론트엔드단 구현 병행
- DB 설계 (클래스, 클래스이미지, 취미용품, 취미용품이미지, 주문, 장바구니, 리뷰 등)
- 클래스, 취미용품 메인
- 클래스, 취미용품 등록 및 수정
- 클래스, 취미용품 리스트 출력
- 클래스, 취미용품 상세페이지 조회
- 클래스, 취미용품 리뷰 등록 및 삭제
- 장바구니 기능 (추가, 중복담기방지, 선택주문, 선택삭제, 전체삭제 등)
- 주문정보 페이지 (다음 주소 API)
- 카카오페이 결제 기능 (아임포트 API)
- 검색창 키워드 검색 (전체검색 / 항목별검색)
- 리스트 버튼형 세부검색
- 리스트 조건순 정렬
- 구매 내역 조회
- 등록 내역 조회
- 리뷰 작성내역 조회
<br><br>

📌 기술<br>
Front-End : HTML, CSS, JavaScript, Ajax, jQuery<br>
Back-End : JAVA 11, JSP<br>
프레임워크 : Spring / MyBatis<br>
데이터베이스 : Oracle<br>
Server : tomcat 9<br>
형상관리 : git<br><br>

📌 ERD<br>
<img src="https://user-images.githubusercontent.com/102012107/191106499-3fb35c48-9ee0-4f62-a29f-e246ae0154e6.png" width="50%" height="50%"/>

📌 임은진 작성 API (뷰단 네이밍은 함수명과 동일합니다) <br>
- 전체 메인 검색(MainController.java - searchMain)<br>
- 클래스 메인 조회(ClassControllerImpl.java - classMain)<br>
- 클래스 등록 페이지(ClassControllerImpl.java - form)<br>
- 클래스 등록 기능 구현(ClassControllerImpl.java - addNewClass)<br>
- 클래스 리스트 출력(ClassControllerImpl.java - listClass)<br>
- 다중 파일 업로드 (ClassControllerImpl.java - upload)<br>
- 클래스 수정 페이지(ClassControllerImpl.java -editClass)<br>
- 클래스 수정 기능 구현(ClassControllerImpl.java - modClass)<br>
- 클래스 수정 이미지(ClassControllerImpl.java - uploadModImageFile)<br>
- 클래스 키워드 검색 리스트(ClassControllerImpl.java - searchList)<br>
- 클래스 상세페이지(ClassControllerImpl.java - classDetail)<br>
- 클래스 리뷰 등록(ClassControllerImpl.java - reviewAdd)<br>
- 클래스 리뷰 삭제(ClassControllerImpl.java - classReviewRemove)<br><br>
- 취미용품 메인 조회(ItemControllerImpl.java - itemMain)<br>
- 취미용품 등록 페이지(ItemControllerImpl.java - form)<br>
- 취미용품 등록 기능 구현(ItemControllerImpl.java - addNewItem)<br>
- 취미용품 리스트 출력(ItemControllerImpl.java - listItem)<br>
- 다중 파일 업로드 (ItemControllerImpl.java - upload)<br>
- 취미용품 수정 페이지(ItemControllerImpl.java -editItem)<br>
- 취미용품 수정 기능 구현(ItemControllerImpl.java - modItem)<br>
- 취미용품 수정 이미지(ItemControllerImpl.java - uploadModImageFile)<br>
- 취미용품 키워드 검색 리스트(ItemControllerImpl.java - searchList)<br>
- 취미용품 상세페이지(ItemControllerImpl.java - itemDetail)<br>
- 취미용품 리뷰 등록(ItemControllerImpl.java - reviewAdd)<br>
- 취미용품 리뷰 삭제(ItemControllerImpl.java - itemReviewRemove)<br><br>
- 장바구니 목록 출력(CartControllerImpl.java - cartClass)<br>
- 장바구니 추가(CartControllerImpl.java - addCart)<br>
- 장바구니 선택 삭제(CartControllerImpl.java - deleteCart)<br>
- 장바구니 전체 삭제(CartControllerImpl.java - deleteAll)<br>
- 장바구니 수량 변경(CartControllerImpl.java - quanEditCart)<br><br>
- 주문 대기목록 출력(OrderContollerImpl.java - orderPage)
- 주문 완료 페이지(OrderContollerImpl.java - orderPagePost)
- 구매 목록 리스트(OrderContollerImpl.java - contractList)
- 내 등록상품 리스트(MypageControllerImpl.java - myAddItem)
- 내 리뷰 리스트(MypageControllerImpl.java - myReview)<br><br>
