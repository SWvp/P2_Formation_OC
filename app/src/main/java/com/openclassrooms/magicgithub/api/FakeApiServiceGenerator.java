package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {

        return new ArrayList<>(FAKE_USERS);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://png.pngtree.com/png-clipart/20190614/original/pngtree-avatar-vector-icon-png-image_3757857.jpg"),
            new User("002", "Paul", "https://png.pngtree.com/png-clipart/20191123/original/pngtree-man-avatar-character-png-image_5199422.jpg"),
            new User("003", "Phil", "https://img.pngio.com/avatar-icon-png-105-images-in-collection-page-3-avatarpng-512_512.png"),
            new User("004", "Guillaume", "https://as2.ftcdn.net/jpg/04/06/53/57/500_F_406535776_UNwLZqulqkdUAHtvQqLCixxxotAWyPFI.jpg"),
            new User("005", "Francis", "https://image.freepik.com/free-vector/mysterious-mafia-man-smoking-cigarette_52683-34828.jpg"),
            new User("006", "George", "https://image.freepik.com/free-vector/modern-people-avatar-casual-clothes-vector-cartoon-illustration-man-with-individual-face-hair-light-digital-frame-dark-blue-computer-picture-web-profile_107791-4258.jpg"),
            new User("007", "Louis", "https://image.freepik.com/free-vector/ballet-couple-dancing-ballet-ballerina-her-partner-pair-statement-man-dancer-supports-waist-ballerina-while-jumping-abstract-silhouette-two-dancers-with-golden-light-outline-vector_312821-18.jpg"),
            new User("008", "Mateo", "https://image.freepik.com/free-vector/portrait-masculine-arab-man-profile-saudi-male-character-illustration_102172-478.jpg"),
            new User("009", "April", "https://image.freepik.com/free-vector/modern-people-avatar-casual-clothes-vector-cartoon-illustration-woman-with-individual-face-hair-light-digital-frame-dark-blue-computer_107791-4255.jpg"),
            new User("010", "Louise", "https://image.freepik.com/free-vector/people-thinking-about-something-smilling-woman-holds-chin_131454-387.jpg"),
            new User("011", "Elodie", "https://image.freepik.com/free-vector/cute-cartoon-panda-christmas-logo-mascot_173981-49.jpg"),
            new User("012", "Helene", "https://image.freepik.com/free-vector/cartoon-black-girl-illustration_23-2148863514.jpg"),
            new User("013", "Fanny", "https://image.freepik.com/free-vector/girl-shy-character_1450-155.jpg"),
            new User("014", "Laura", "https://image.freepik.com/free-vector/beautiful-girl-with-ponytail-sunglasses_1196-912.jpg"),
            new User("015", "Gertrude", "https://image.freepik.com/free-vector/serious-young-girl-blue-polka-dot-dress-thinking-about-something_1268-15168.jpg"),
            new User("016", "Chloé", "https://image.freepik.com/free-vector/lady-photographer-is-taking-photo-beautiful-sunset-farther-man-is-stealing-her-glance_42859-618.jpg"),
            new User("017", "April", "https://image.freepik.com/free-vector/cute-girl-gaming-holding-joystick-cartoon-icon-illustration-people-technology-icon-concept-isolated-flat-cartoon-style_138676-2169.jpg"),
            new User("018", "Marie", "https://image.freepik.com/free-vector/cute-astronaut-riding-rocket-waving-hand-cartoon-icon-illustration-science-technology-icon-concept_138676-2130.jpg"),
            new User("019", "Henri", "https://image.freepik.com/free-vector/cute-boy-standing-position-showing-thumb_96037-450.jpg"),
            new User("020", "Rémi", "https://image.freepik.com/free-vector/fox-master-esport-logo-gaming_322595-28.jpg")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://image.freepik.com/free-vector/young-girl-thumbs-up-sign-cartoon-set-illustration-premium-vector_56104-310.jpg"),
            new User("022", "Geoffrey", "https://image.freepik.com/free-vector/man-working-laptop-with-coffee-stationary-cartoon-vector-illustration_138676-2206.jpg"),
            new User("023", "Simon", "https://image.freepik.com/free-vector/light-businessman-shadow-devil-appearances-are-deceptive-business-manager-demon-professional-career_1284-43705.jpg"),
            new User("024", "André", "https://image.freepik.com/free-vector/men-style-fashion-male-clothes-elegant-apparel-stylish-accessories-handsome-man-wearing-luxury-jacket-bearded-macho-fixing-tie_335657-3602.jpg"),
            new User("025", "Leopold", "https://image.freepik.com/free-vector/shivaji-maharaj-illustration_23-2148474380.jpg")
    );
}
