
## 구현 기능 목록

---
### 1. 자동차 입력
- 쉼표(,)로 자동차 이름을 구분한다.
- 자동차 이름은 5자 이하로 생성한다.
    - 5자보다 긴 경우 예외발생

### 2. 시도 횟수(차수) 입력
- 숫자로 입력
    - 숫자로 입력 안할 시 예외발생
    - 음수 값 입력 시 예외발생
    -


### 3. 경기 중
- 멈춤 : 랜덤 숫자(0~9) 중 0 ~ 3인 경우 '-' 추가안함
- 전진 : 랜덤 숫자(0~9) 중 4 ~ 9인 경우 '-' 추가
- 각 차수 마다 " 전진 | 멈춤 " 을 ' - ' 유무로 표현
    ```java
      car1 : --- 
      car2 : -   
      car3 : --        
      
      * 위 예제는 3차수 까지 진행


### 4. 경기 후
- 우승자 출력
- 우승자는 한명 이상일 수도 있다.


<br>
<br>