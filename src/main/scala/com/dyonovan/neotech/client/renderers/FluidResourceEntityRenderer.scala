package com.dyonovan.neotech.client.renderers

import com.dyonovan.neotech.pipes.tiles.fluid.FluidExtractionPipe
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer
import net.minecraftforge.fml.relauncher.{SideOnly, Side}

/**
 * This file was created for NeoTech
 *
 * NeoTech is licensed under the
 * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * @author Paul Davis pauljoda
 * @since August 20, 2015
 */
@SideOnly(Side.CLIENT)
class FluidResourceEntityRenderer extends TileEntitySpecialRenderer[FluidExtractionPipe] {
    override def renderTileEntityAt(tile: FluidExtractionPipe, posX: Double, posY: Double, posZ: Double, partialTick: Float, integer: Int): Unit = {
        val resourceList = tile.asInstanceOf[FluidExtractionPipe].resources
        for (i <- 0 until resourceList.size()) {
            val resource = resourceList.get(i)
            resource.renderResource(partialTick)
        }
    }
}