/**
 * 생성자 상속관계:자식클래스
 * @author kaywon1
 *
 */
public class B extends A{
    
	int c;
	
	B(int a, int b) {
		
		super(a, b);
	}
	
	B(int a, int b, int c) {
    
		super(a, b);
	
		this.c =c;
	}
}
