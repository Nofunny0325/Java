public class Squirtle extends Pokemon{
    public Squirtle(int hp, int attackPower){
        super("꼬북이", hp, attackPower); // 부모 클래스의 생성자 호출
        System.out.println("꼬북꼬북~");
    }

    @Override
    public void attcak(Pokemon target) {
        System.out.println(name + " -> " + target.getName() + "에게 '하이드로펌프' 사용"); // name is protected
    }
}
