package com.dyonovan.neotech.api.jei.centrifuge

import com.dyonovan.neotech.lib.Reference
import mezz.jei.api.recipe.{IRecipeWrapper, IRecipeHandler}

/**
  * This file was created for NeoTech
  *
  * NeoTech is licensed under the
  * Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License:
  * http://creativecommons.org/licenses/by-nc-sa/4.0/
  *
  * @author Dyonovan
  * @since 2/22/2016
  */
class JEICentrifugeRecipeHandler extends IRecipeHandler[JEICentrifugeRecipe]{

    override def getRecipeWrapper(recipe: JEICentrifugeRecipe): IRecipeWrapper = recipe

    override def getRecipeCategoryUid: String = Reference.MOD_ID + ":centrifuge"

    override def isRecipeValid(recipe: JEICentrifugeRecipe): Boolean = true

    override def getRecipeClass: Class[JEICentrifugeRecipe] = classOf[JEICentrifugeRecipe]
}
