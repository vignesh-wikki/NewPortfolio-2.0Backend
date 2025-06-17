package com.vignesh.service;

import com.vignesh.model.ProjectsModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProjectService {
    @Value("${server.port}")
    private static String generateID() {
        return UUID.randomUUID().toString();
    }

    public ProjectsModel[] getAllData() {
        return new ProjectsModel[]{new ProjectsModel(generateID(), "Netflix Clone", "My experience on this project was awesome in learning the react . And this my first project in react.", "https://logodix.com/logo/707805.jpg", new String[]{"React", "Styled components", "Rest api"}, "https://netflixclone-ten-gamma.vercel.app/", true), new ProjectsModel(generateID(), "Youtube", "This is my first project in React Native, it is a cross-platform framework, then I am a beginner level at this cross-platform app development. ", "https://www.pixelstalk.net/wp-content/uploads/2016/05/Youtube-Wallpapers-HD.png", new String[]{"React-native", "Styled components"}, "https://github.com/vignesh-wikki/YoutubeClone", false), new ProjectsModel(generateID(), "Signfilter", "A SignFilter is a Hand recognition project. This my first step into the AI and ML and this was developed on Python3. ", "https://newportfolio-2-0backend.onrender.com/images/SignFilter.jpg", new String[]{"Artificial Intelligence", "Machine learning"}, "https://github.com/vignesh-wikki/SignFilter", false), new ProjectsModel(generateID(), "New Portfolio", "My new portfolio, it was developed by React with Tailwind css.", "https://newportfolio-2-0backend.onrender.com/images/newportfolio.png", new String[]{"React", "Tailwind css"}, "https://wikki-portfolio.vercel.app/", true), new ProjectsModel(generateID(), "HallBookingSystem", "My experience on this project was awesome in learning the react with node(express js) sever, and database is Mongodb. Then it MERN stack project.", "https://c0.wallpaperflare.com/preview/655/465/293/meeting-conference-seminar-event.jpg", new String[]{"React js", "Node js with MongoDB"}, "https://hall-booking-system.vercel.app/", true), new ProjectsModel(generateID(), "MovieTicket booking", "My experience on this project was awesome in learning the react with restful apis.", "https://kaliforms.com/wp-content/uploads/2021/04/movie-ticket-booking-form-scaled.jpg", new String[]{"React js", "Restful API"}, "https://movieticket-booking.vercel.app/", true), new ProjectsModel(generateID(), "Old portfolio", "A pure html and css portfolio with backend. The backend created by using Node(express js) with MongoDB database.", "https://newportfolio-2-0backend.onrender.com/images/old_portfolio.png", new String[]{"HTML/CSS", "Express js and MongoDB"}, "https://portfolioo-f7q8.onrender.com/", true)};
    }

}
