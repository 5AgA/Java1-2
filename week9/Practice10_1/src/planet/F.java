package planet;

class F {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		System.out.println(aobj.prv);	// 같은 클래스가 아니라서 안됨, getter로 불러오기
	}
}
