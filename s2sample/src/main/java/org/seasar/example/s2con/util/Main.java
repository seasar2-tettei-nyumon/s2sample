package org.seasar.example.s2con.util;

import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {

	public static void main(String[] args) {
		
		//●こうやると初期化時に読み込むdiconを変更することができる（多分initメソッドを実行するとこの設定が実行されるんだろう）
		//SingletonS2ContainerFactory.setConfigPath("app2.dicon");
		
		SingletonS2ContainerFactory.init();//「app.dicon」を読み込む。●これを省略できる方法が知りたい。Webアプリは自動的に呼び出すらしいが。
		IMessageProviderUtil messageProvider = SingletonS2Container.getComponent(IMessageProviderUtil.class);//インタフェースの型を指定している。
		System.out.println(messageProvider.getMessage());
		SingletonS2ContainerFactory.destroy();
	}
}
