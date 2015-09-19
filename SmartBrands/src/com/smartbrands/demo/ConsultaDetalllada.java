package com.smartbrands.demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class ConsultaDetalllada extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_consulta_detalllada);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.consulta_detalllada, menu);
		return true;
	}

}
