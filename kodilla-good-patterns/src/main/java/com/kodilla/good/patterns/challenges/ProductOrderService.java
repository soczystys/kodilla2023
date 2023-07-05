package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private BuyingService buyingService;
    private BuyingRepository buyingRepository;

    public ProductOrderService(InformationService informationService, BuyingService buyingService, BuyingRepository buyingRepository) {
        this.informationService = informationService;
        this.buyingService = buyingService;
        this.buyingRepository = buyingRepository;
    }

    public BuyingDto process(final BuyRequest buyRequest) {
        boolean isAvailable = buyingRepository.buy(buyRequest.getBuyer(), buyRequest.getProduct(), buyRequest.getRetailer());

        if (isAvailable) {
            informationService.informBuyer(buyRequest.getBuyer(), buyRequest.getProduct());
            informationService.informRetailer(buyRequest.getBuyer(), buyRequest.getProduct());
            buyingRepository.bookProduct(buyRequest.getBuyer(), buyRequest.getProduct(), buyRequest.getRetailer());
            return new BuyingDto(buyRequest.getBuyer(), true);
        } else {
            return new BuyingDto(buyRequest.getBuyer(), false);
        }
    }
}
