package ð������;
/**
 * ð������
 * @author �ڽ���
 *
 */
public class testmaopao {
	public static void main(String[] args) {
		
		int temp;
		int[] value= {3,1,6,2,9,0,7,4,5,8};
		boolean T;
		for(int i=0;i<value.length-1;i++) {
			T=true;//�Ż��������һѭ��û�з����������ʾ��������ɣ�������ֹѭ��
		for(int j=0;j<value.length-1-i;j++) {
			if(value[j]>value[j+1]) {
				temp=value[j];
				value[j]=value[j+1];
				value[j+1]=temp;
				T=false;
			}
			if(T) {
				break;
			}
		}
		}
		
		for(int k:value) {
			System.out.println(k);
		}
		
	}
}
