# 숫자 합 문제

## __문제1__
연속된 숫자들의 합을 계산 (1~n 까지의 합)

### __풀이 1__
가우스 공식을 이용
1. 1+2+3+...+(n-2)+(n-1)+(n) = n*(n+1)/2

#### __소스 코드__
``` java
public long sum(long max) {

  long sumNum=0;
  sumNum = max*(max+1)/2;

  return sumNum;
}
```

### __풀이 2__
반복문을 이용

#### __소스 코드__
```java
public long sum(long max) {

  long sumNum=0;
  for(int index=0 ; index<max ; index++) {
    sumNum=sumNum+(index+1);
  }

  return sumNum;
}
```
