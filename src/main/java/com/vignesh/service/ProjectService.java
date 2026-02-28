package com.vignesh.service;

import com.vignesh.model.ProjectsModel;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ProjectService {

    private static String generateID() {
        return UUID.randomUUID().toString();
    }

    public ProjectsModel[] getAllData() {
        return new ProjectsModel[]{
                new ProjectsModel(
                        generateID(),
                        "Netflix Clone",
                        "My experience on this project was awesome in learning the react. And this is my first project in React.",
                        "https://logodix.com/logo/707805.jpg",
                        new String[]{"React", "Styled components", "Rest api"},
                        "https://netflixclone-ten-gamma.vercel.app/",
                        true
                ),
                new ProjectsModel(
                        generateID(),
                        "Youtube Clone",
                        "This is my first project in React Native, a cross-platform framework. I am at a beginner level at cross-platform app development.",
                        "https://www.pixelstalk.net/wp-content/uploads/2016/05/Youtube-Wallpapers-HD.png",
                        new String[]{"React-native", "Styled components"},
                        "https://github.com/vignesh-wikki/YoutubeClone",
                        false
                ),
                new ProjectsModel(
                        generateID(),
                        "SignFilter",
                        "A Hand recognition project. My first step into AI and ML, developed with Python3.",
                        "https://images.unsplash.com/photo-1535378917042-10a22c95931a?w=800&q=80",
                        new String[]{"Artificial Intelligence", "Machine learning"},
                        "https://github.com/vignesh-wikki/SignFilter",
                        false
                ),
                new ProjectsModel(
                        generateID(),
                        "New Portfolio",
                        "My new portfolio, developed with React and Tailwind CSS for a modern, responsive design.",
                        "https://images.unsplash.com/photo-1460925895917-afdab827c52f?w=800&q=80",
                        new String[]{"React", "Tailwind CSS"},
                        "https://wikki-portfolio.vercel.app/",
                        true
                ),
                new ProjectsModel(
                        generateID(),
                        "Hall Booking System",
                        "A MERN stack project with React, Node.js (Express), and MongoDB for managing hall bookings.",
                        "https://c0.wallpaperflare.com/preview/655/465/293/meeting-conference-seminar-event.jpg",
                        new String[]{"React js", "Node js with MongoDB"},
                        "https://hall-booking-system.vercel.app/",
                        true
                ),
                new ProjectsModel(
                        generateID(),
                        "Movie Ticket Booking",
                        "A React-based movie ticket booking app using RESTful APIs for seamless ticket reservations.",
                        "https://kaliforms.com/wp-content/uploads/2021/04/movie-ticket-booking-form-scaled.jpg",
                        new String[]{"React js", "Restful API"},
                        "https://movieticket-booking.vercel.app/",
                        true
                ),
                new ProjectsModel(
                        generateID(),
                        "Old Portfolio",
                        "A pure HTML and CSS portfolio with a Node.js (Express) and MongoDB backend.",
                        "https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?w=800&q=80",
                        new String[]{"HTML/CSS", "Express js and MongoDB"},
                        "https://portfolioo-f7q8.onrender.com/",
                        true
                )
        };
    }
}
