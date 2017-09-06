# 숫자 합 문제

## __문제 1__
연속된 숫자들의 합을 계산 (1~n 까지의 합)

### __풀이-1__
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

### __풀이-2__
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

## __문제 2__
연속된 숫자들 중 짝수의 합을 계산 (1~n 사이의 짝수 합)

### __풀이-1__
규칙 찾기
1. n=2 -> 2 = 2
</br> n=4 -> 2+4 = 6
</br> n=6 -> 2+4+6 =8 ...
2. (짝수 합) = (count)²+count

#### __소스 코드__
``` java
public long sumEven(long max){

  if(max%2==1) max=max+1;
  long count = max/2;
  return count*count + count;
}
```

### __풀이-2__
짝수 특징 이용
1. n=2 -> 2 = 2\*(1)
</br> n=4 -> 2+4 = 2\*(1+2)
</br> n=6 -> 2+4+6 =2\*(1+2+3) ...
2. (짝수 합) = 2\*(sum(n/2))

#### __소스 코드__
``` java
public long sumEven(long max) {

  long sumNumEven = 0;
  long temp = max/2;
  sumNumEven = 2*(temp*(temp+1)/2); //temp^2+temp
  return sumNumEven;
}
```
## __문제 3__
연속된 숫자들 중 홀수의 합을 계산 (1~n 사이의 홀수 합)

### __풀이__
규칙 찾기
1. n=1 -> 1 = 1 = 1²
</br> n=3 -> 1+3 = 4 = 2²
</br> n=5 -> 1+3+5 =9 = 3² ...
2. (홀수 합) = (count)²

#### __소스 코드__
``` java
public long sumOdd(long max){

  if(max%2==1) max=max+1;
  long count = max/2;
  return count *count;
}
```
