# java-racingcar

자동차 경주 미션 저장소
<br>
<br>

# 🕰️ 개발기간
* 2023.06.16 ~ 2023.06.17
<br>


# ⚙️ 개발환경
- 'java 8'
- **IDE** : intelliJ 2022.1.2
- **Test Framework** : Junit(5.x.x)

<br>


# 📌 기능 요구 사항
### ⌨️ UI
  #### 입력
    - 자동차 수 입력
    - 전진 시도 횟수 입력
    - **exception** : 입력값이 숫자가 아닐 시
    - **exception** : 입력값이 0보다 작을 시

  #### 출력
    - 전진 시도 때마다 현재 자동차의 위치값 출력
    
### 🧾 비지니스 로직
  #### 자동차 생성 기능
    - 자동차 객체 생성
  #### 자동차 관리 기능
    - 전진 여부 유효성 검증
    - 자동차 객체와 Car List의 접근을 책임짐
  #### 자동차 List 생성 기능
    - 자동차 수 입력값의 크기를 가지는 Car List 생성
    - Car List는 일급 컬렉션으로 관리
    - !! Car List의 크기가 입력된 자동차 수와 같아야함
  #### 무작위 값 생성 기능
    - 0~10사이의 무작위 값 생성
  #### 전진 기능
    - 전진 성공 시 차량 위치값 +1
    - 전진 실패 시 차량 위치값 -1


<br>
<br>
<br>

## 우아한테크코스 코드리뷰

- [온라인 코드 리뷰 과정](https://github.com/woowacourse/woowacourse-docs/blob/master/maincourse/README.md)
