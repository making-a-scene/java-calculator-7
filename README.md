# [java-calculator-precourse](https://github.com/making-a-scene/java-calculator-7)

## 기능 목록

- [x]  문자열 입력받기 (라이브러리 활용)
    - [x]  입력받은 문자열이 빈 문자열인 경우 0 반환
<br><br>
- [ ]  커스텀 구분자 사용 여부 확인
    - [ ]  charAt()을 이용해 입력받은 문자열의 0번째 인덱스에 접근.
        - [ ]  0번째 인덱스의 문자가 숫자라면 → false 반환
        - [ ]  0번째 인덱스의 문자가 '/'라면 -> true 반환
    - [ ]  0번째 인덱스의 문자가 숫자, '/' 중 어느 것도 아니라면 → 예외 발생.
<br><br>
- [ ] 입력된 문자열이 커스텀 구분자를 사용하는 경우 커스텀 구분자 추출해 반환
  - - [ ]  인덱스를 1부터 3까지 증가시키며 각 인덱스의 문자가 커스텀 지정자 형식에 맞는지 확인
      - [ ]  커스텀 지정자 형식에 맞다면 → 해당 커스텀 지정자를 반환
      - [ ]  형식에 맞지 않는 않는다면 → 예외 발생.
<br><br>
- [ ]  문자열을 구분자를 기준으로 분리하기 위한 정규식 생성
    - [ ]  파라미터로 받은 커스텀 지정자 사용 여부가 false라면 기본 구분자인 ‘,’와 ‘:’만 사용한다는 뜻. → ";|:” 반환
    - [ ]  커스텀 지정자 사용 여부가 true라면 “;|:” + 파라미터로 받은 구분자 반환
<br><br>
- [ ]  구분자를 기준으로 문자열을 분할해 String 타입의 배열에 저장
    - [ ]  split()의 매개변수로 위에서 생성한 정규식을 전달.
<br><br>
- [ ]  덧셈 연산 수행
    - [ ]  String 타입 배열의 원소에 하나씩 접근
        - [ ]  해당 원소에 저장된 문자열이 숫자가 아니라면 → 예외 발생
        - [ ]  숫자라면 Integer.parseInt()를 사용해 int 타입으로 변환
        - [ ]  변환된 값을 누적해서 저장