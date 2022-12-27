
public class SlectionSort {
public static void main(String[] args) {
int a[]= {4,32,45,3,2,78,10};
        int min, temp=0;
for(int i=0;i<a.length;i++) {
min=i;
for(int j=i+1;j<a.length;j++) {
if(a[j]<a[min]) {
min=j;
}
}
temp=a[i];
a[i]=a[min];
a[min]=temp;
}
for(int i=0;i<a.length-1;i++)
System.out.println(a[i]);
}
}

