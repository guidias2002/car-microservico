package com.portal.api.service;

import com.portal.api.client.CarPostStoreClient;
import com.portal.api.dto.CarPostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarPostStoreServiceImpl implements CarPostStoreService{

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public List<CarPostDto> getCarForSales() {
        return carPostStoreClient.carForSaleClient();
    }

    @Override
    public void changeCarForSale(CarPostDto carPost, String id) {
        carPostStoreClient.changeCarForSaleClient(carPost, id);
    }

    @Override
    public void removeCarForSale(String id) {
        carPostStoreClient.deleteCarForSaleClient(id);
    }
}
