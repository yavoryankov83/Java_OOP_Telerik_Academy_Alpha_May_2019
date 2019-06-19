package com.telerikacademy.cosmetics.commands;

import com.telerikacademy.cosmetics.core.contracts.Command;
import com.telerikacademy.cosmetics.core.contracts.CosmeticsFactory;
import com.telerikacademy.cosmetics.core.contracts.CosmeticsRepository;

import com.telerikacademy.cosmetics.models.common.GenderType;
import com.telerikacademy.cosmetics.models.common.ScentType;
import com.telerikacademy.cosmetics.models.contracts.Product;

import java.util.List;

import static com.telerikacademy.cosmetics.commands.CommandConstants.*;

public class CreateCream implements Command {
    private CosmeticsRepository cosmeticsRepository;
    private CosmeticsFactory cosmeticsFactory;

    public CreateCream(CosmeticsRepository cosmeticsRepository, CosmeticsFactory cosmeticsFactory) {
        this.cosmeticsRepository = cosmeticsRepository;
        this.cosmeticsFactory = cosmeticsFactory;
    }

    @Override
    public String execute(List<String> parameters) {
        String creamName = parameters.get(0);
        String creamBrand = parameters.get(1);
        double creamPrice = Double.parseDouble(parameters.get(2));
        GenderType creamGender = GenderType.valueOf(parameters.get(3).toUpperCase());
        ScentType creamScent = ScentType.valueOf(parameters.get(4).toUpperCase());
        return createCream(creamName, creamBrand, creamPrice, creamGender, creamScent);
    }

    private String createCream(String creamName, String creamBrand, double creamPrice, GenderType creamGender, ScentType creamScent) {
        if (cosmeticsRepository.getProducts().containsKey(creamName)) {
            return String.format(CommandConstants.CREAM_ALREADY_EXIST, creamName);
        }

        Product cream = cosmeticsFactory.createCream(creamName, creamBrand, creamPrice, creamGender, creamScent);
        cosmeticsRepository.getProducts().put(creamName, cream);

        return String.format(CommandConstants.CREAM_CREATED, creamName);
    }
}
