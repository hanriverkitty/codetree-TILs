# 속도 증가, 감소, 유지
# 1부터 현재 속도까지의 합
x = int(input())
speed = 1
distance = x
sec = 0
def sum_speed1(v):
    sum_all = 0
    for i in range(v + 2):
        sum_all += i
    return sum_all
# (v + 1) * (v + 2) / 2으로 표현 가능
def sum_speed2(v):
    sum_all = 0
    for i in range(v + 1):
        sum_all += i
    return sum_all
 # v * (v + 1) / 2으로 표현 가능
while distance:
    distance -= speed
    sec += 1
    if distance >= sum_speed1(speed):
        speed += 1
    elif distance >= sum_speed2(speed):
        pass  
    # 속도가 1이 되면 위 조건에 해당되기 때문에 속도가 0이 될 걱정은 하지 않아도 됨     
    else:
        speed -= 1    

print(sec)