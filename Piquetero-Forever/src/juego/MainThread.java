package juego;

import juego.entidad.Entidad;

public class MainThread extends Thread
{
	Juego juego;
	
	public MainThread(Juego j) 
	{
		this.juego = j;
	}
	
	@Override
	public void run() 
	{
		juego.accionar();
		try 
		{
			wait(100);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
