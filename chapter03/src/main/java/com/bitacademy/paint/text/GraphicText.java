package com.bitacademy.paint.text;

import com.bitacademy.paint.i.Drawable;

public class GraphicText implements Drawable {
	private String text;
	
	// 생성자 추가하여 기본 생성자 추가 안됨 메인에서 graphictext draw
	public GraphicText(String text) {
		this.text = text;
	}
	@Override
	public void draw() {
		System.out.println("'" + text + "' 를 그렸습니다.");

	}

}
