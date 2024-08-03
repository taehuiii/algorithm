import heapq

def solution(scoville, K):
    
    cost={}
    pq=[]
    cnt=0
    
    for i in scoville:
        heapq.heappush(pq,i)

    while len(pq)>=2:
        temp = heapq.heappop(pq)
        if(temp <K):
            next = heapq.heappop(pq)
            heapq.heappush(pq, temp+next*2)
            cnt+=1
    if heapq.heappop(pq) > K:
        return cnt

    return -1