#include <stdio.h>
#include <stdio.h>
#include <string.h>
unsigned long long min(unsigned long long x, unsigned long long y);
unsigned long long ans[1000001];

int main(){
  int Q,N,i,j;
  memset(ans,-1,sizeof(ans));
  ans[0]=0;
  for(i=0;i<1000000;i++){
    ans[i+1]=min(ans[i+1],ans[i]+1);
    for(j=2;j<=i && i*(unsigned long long)j<1000001;j++)
      ans[i*j]=min(ans[i*j],ans[i]+1);
  }
  scanf("%d",&Q);
  while(Q--){
    scanf("%d",&N);
    printf("%llu\n",ans[N]);
  }
  return 0;
}
unsigned long long min(unsigned long long x, unsigned long long y){
  return (x>y)?y:x;
}
