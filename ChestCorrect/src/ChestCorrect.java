import java.util.logging.Logger;

/**
* ChestCorrect v1.x
* Copyright (C) 2012 Visual Illusions Entertainment
* @author darkdiplomat <darkdiplomat@visualillusionsent.net>
* 
* This file is part of ChestCorrect
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see http://www.gnu.org/copyleft/gpl.html.
*/

public class ChestCorrect extends Plugin{
	private String name = "ChestCorrect";
	private String author = "darkdiplomat";
	private double version = 1.3;
	
	static final Logger log = Logger.getLogger("Minecraft");
	 
	public void enable(){
		log.info(name + " v" + version +  " by " + author + " Enabled.");
	}

	public void disable(){
		log.info(name + " v" + version + " Plugin Disabled.");
	}

	public void initialize(){
		CCListener listener = new CCListener();
		etc.getLoader().addListener(PluginLoader.Hook.BLOCK_RIGHTCLICKED, listener, this, PluginListener.Priority.LOW);
	}
}