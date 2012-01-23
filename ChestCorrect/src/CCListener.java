
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

public class CCListener extends PluginListener{
	public boolean onBlockRightClick(Player player, Block blockClicked, Item itemInHand){
		if(player.canUseCommand("/chestcorrect")){
			if (itemInHand.getItemId() == 280){
				if (blockClicked.getType() == 54){
					Chest chest = (Chest)blockClicked.getWorld().getOnlyComplexBlock(blockClicked);
					if(chest.findAttachedChest() != null){
						for(int x = (blockClicked.getX() - 1); x < (blockClicked.getX() + 2); x++){
							for(int z = (blockClicked.getZ() -1); z < (blockClicked.getZ() + 2); z++){
								Block block = player.getWorld().getBlockAt(x, blockClicked.getY(), z);
								if(block.getType() == 54 && block != blockClicked){
									if(x != blockClicked.getX() && z == blockClicked.getZ()){
										if (blockClicked.getFaceClicked() == Block.Face.Right){
											player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x2));
											return true;
										}
										else if (blockClicked.getFaceClicked() == Block.Face.Left){
											player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x3));
											return true;
										}
										
									}
									else if(z != blockClicked.getZ() && x == blockClicked.getX()){
										if (blockClicked.getFaceClicked() == Block.Face.Back){
											player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x4));
											return true;
										}
										else if (blockClicked.getFaceClicked() == Block.Face.Front){
											player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x5));
											return true;
										}
									}
								}
							}
						}
					}
					else{
						if (blockClicked.getFaceClicked() == Block.Face.Right){
							player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x2));
							return true;
						}
						else if (blockClicked.getFaceClicked() == Block.Face.Left){
							player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x3));
							return true;
						}
						else if (blockClicked.getFaceClicked() == Block.Face.Back){
							player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x4));
							return true;
						}
						else if (blockClicked.getFaceClicked() == Block.Face.Front){
							player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x5));
							return true;
						}
						else{
							return false;
						}
					}
				}
				else if(blockClicked.getType() == 23 || blockClicked.getType() == 61 || blockClicked.getType() == 62){
					if (blockClicked.getFaceClicked() == Block.Face.Right){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x2));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Left){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x3));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Back){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x4));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Front){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x5));
						return true;
					}
				}
				else if ((blockClicked.getType() == 29 || blockClicked.getType() == 33) && (!(blockClicked.isIndirectlyPowered() || blockClicked.isPowered()))){
					if (blockClicked.getFaceClicked() == Block.Face.Right){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x2));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Left){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x3));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Back){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x4));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Front){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x5));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Top){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x1));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Bottom){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x0));
						return true;
					}
				}
				else if (blockClicked.getType() == 86 || blockClicked.getType() == 91){
					if (blockClicked.getFaceClicked() == Block.Face.Right){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x2));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Left){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x0));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Back){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x1));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Front){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x3));
						return true;
					}
				}
				else if (blockClicked.getType() == 53 || blockClicked.getType() == 67 || blockClicked.getType() == 108 || blockClicked.getType() == 109 || blockClicked.getType() == 114){
					if (blockClicked.getFaceClicked() == Block.Face.Right){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x2));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Left){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x3));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Back){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x0));
						return true;
					}
					else if (blockClicked.getFaceClicked() == Block.Face.Front){
						player.getWorld().updateBlockPhysics(blockClicked.getX(), blockClicked.getY(), blockClicked.getZ(), (blockClicked.getData() | 0x1));
						return true;
					}
				}
			}
		}
		return false;
	}
}
