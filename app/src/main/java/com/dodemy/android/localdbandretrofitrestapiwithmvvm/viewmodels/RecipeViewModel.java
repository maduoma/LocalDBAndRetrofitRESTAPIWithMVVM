package com.dodemy.android.localdbandretrofitrestapiwithmvvm.viewmodels;


import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.dodemy.android.localdbandretrofitrestapiwithmvvm.repositories.RecipeRepository;
import com.dodemy.android.localdbandretrofitrestapiwithmvvm.models.Recipe;
import com.dodemy.android.localdbandretrofitrestapiwithmvvm.util.Resource;


public class RecipeViewModel extends AndroidViewModel {

    private RecipeRepository recipeRepository;

    public RecipeViewModel(@NonNull Application application) {
        super(application);
        recipeRepository = RecipeRepository.getInstance(application);
    }

    public LiveData<Resource<Recipe>> searchRecipeApi(String recipeId){
        return recipeRepository.searchRecipesApi(recipeId);
    }
}





















