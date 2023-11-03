//package com.fil.easmystay.service;
//
//import com.fil.easmystay.repository.HotelSearchRepo;
//import com.fil.easmystay.models.Hotel;
//import com.fil.easmystay.models.HotelSearch;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class HotelSearchServiceImpl implements HotelSearchService {
//
//    private final HotelSearchRepo hotelSearchRepo;
//
//    @Autowired
//    public HotelSearchServiceImpl(HotelSearchRepo hotelSearchRepo) {
//        this.hotelSearchRepo = hotelSearchRepo;
//    }
//
//    @Override
//    public List<HotelSearch> getAllHotelSearches() {
//        return hotelSearchRepo.findAll();
//    }
//
//    @Override
//    public HotelSearch getHotelSearchById(long id) {
//        return hotelSearchRepo.findById(id).orElse(null);
//    }
//
//    @Override
//    public HotelSearch createHotelSearch(HotelSearch hotelSearch) {
//        return hotelSearchRepo.save(hotelSearch);
//    }
//
//    @Override
//    public HotelSearch updateHotelSearch(long id, HotelSearch updatedHotelSearch) {
//        HotelSearch existingHotelSearch = hotelSearchRepo.findById(id).orElse(null);
//        if (existingHotelSearch != null) {
//            
//            existingHotelSearch.setState(updatedHotelSearch.getState());
//            existingHotelSearch.setSuburb(updatedHotelSearch.getSuburb());
//            existingHotelSearch.setPostcode(updatedHotelSearch.getPostcode());
//           
//            return hotelSearchRepo.save(existingHotelSearch);
//        }
//        return null; 
//    }
//
//    @Override
//    public void deleteHotelSearch(long id) {
//        hotelSearchRepo.deleteById(id);
//    }
//
//	@Override
//	public List<Hotel> searchHotels(HotelSearch hotelSearch) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Hotel> searchHotels(String state, String suburb, String postcode) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}