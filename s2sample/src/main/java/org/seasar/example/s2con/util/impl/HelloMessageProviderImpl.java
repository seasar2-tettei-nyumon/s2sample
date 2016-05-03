package org.seasar.example.s2con.util.impl;

import javax.annotation.Resource;

import org.seasar.example.s2con.util.IMessageProviderUtil;
import org.seasar.example.s2con.util.IMessageTargetUtil;

public class HelloMessageProviderImpl implements IMessageProviderUtil{

	@Resource//このアノテーション付けたら、セッターインジェクションがなくても（実装のため存在は必要だけど）nullにならないのを確認できた。●このアノテーションをコメントアウトすると、ヌルポが出るのも確認できた。
	private IMessageTargetUtil messageTarget;

//	@Override//●こいつは別に消しても（そのときはインタフェースのほうも消すことだ）、フィールドにインジェクションされる。
//	public void setMessageTarget(IMessageTargetUtil messageTarget) {
//	//	this.messageTarget = messageTarget;
//	}

	@Override
	public String getMessage() {
		return "Hello, " + messageTarget.getName() + "!";
	}
}
