public class gameApp{
	public static void main(String[] args){
		game_main_status mario = new game_main_status("super_mario_world", 5160, "3D_action");
		game_sale_type arknights = new game_sale_type("arknights", 0, "tower_deffence", "download", "12.12GB");
		mario.print();
		System.out.println(" ");
		arknights.print();
	}
}
