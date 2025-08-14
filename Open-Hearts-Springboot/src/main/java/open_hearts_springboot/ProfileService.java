package open_hearts_springboot;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private final Map<Integer, Profile> profiles; // Maps profileId to Profile
    private final Random random;

    public ProfileService() {
        this.random = new Random();
        this.profiles = new HashMap<>();

        // Sample Profile 1: Michael Carter (Scammer)
        Map<String, List<String>> michaelDialogues = new HashMap<>();
        michaelDialogues.put("option0", Arrays.asList(
            "I do a lot of different projects as a civil engineer. Right now, I’m working with a client to finish a construction project that’s been in development for over a year.",
            "I can’t really go into detail. The project is for the government, and deadlines have been tight recently. It’s been stressful.",
            "I wasn’t sure if I should say anything, but I really need someone to talk to. I’ve hit a bit of a problem with the project out here.",
            "There’s been a delay with the client’s payment. I’ve already covered most of the materials and labor out of pocket, and now the crew’s threatening to stop working if I can’t cover the rest by the end of this week. I hate to even bring this up, but I really don’t have anyone else to turn to. If you could help me just this once, I’d pay you back as soon as the contract clears."
        ));
        michaelDialogues.put("option1", Arrays.asList(
            "I’d love to, but the signal here is really bad. I probably couldn’t do a video call right now",
            "I get that. I’d love to, just not possible right now. Maybe later this week if the connection improves. Hope that’s okay."
        ));
        michaelDialogues.put("option2", Arrays.asList(
            "I’ve taken a few pics. I’ll send some when I get a moment. Things have been pretty hectic lately.",
            "Sure, I’ll send one when I get a break. Work’s been a lot lately. I barely have time to sleep."
        ));
        michaelDialogues.put("option3", Arrays.asList(
            "I’m looking for a long-term relationship! I don’t normally say this, but as soon as I saw your profile, I felt an instant connection. I’ve never felt this way with anyone before…",
            "Do you think I’d say these things if I didn’t mean them? I know this feels fast, but when it’s right, you just know."
        ));

        List<String> michaelHobbies = Arrays.asList(
            "Traveling",
            "Cooking (especially Italian food)",
            "Reading motivational books",
            "Going to church",
            "Long walks on the beach",
            "Philanthropy (talks about wanting to give back, start a foundation someday)",
            "Watching documentaries"
        );

        List<String> michaelOptions = Arrays.asList(
            "Hey there Michael! I see that you're an international civil engineer. What exactly do you do for work?",
            "Hi, nice to meet you Michael! Do you want to do a video call to get to know each other?",
            "Great to meet you! I see you're abroad in Turkey–would you mind sending a few photos of what it's like over there?",
            "What are you looking for in a relationship?"
        );

        Profile michaelCarter = new Profile("Michael Carter", true, michaelDialogues, michaelOptions, 0, 46, michaelHobbies, "Houston, Texas", "International Civil Engineer");

        // Sample Profile 2: Sarah Lin (Real Person)
        Map<String, List<String>> sarahDialogues = new HashMap<>();
        sarahDialogues.put("option0", Arrays.asList(
            "I work in epidemiology, mostly managing data for community health programs. Lately I’ve been coordinating with local clinics to track chronic illness trends.",
            "Right now I’m helping build out a tool that maps out neighborhood-level health data, so we can focus outreach better. It’s not flashy, but I like it a lot!"
        ));
        sarahDialogues.put("option1", Arrays.asList(
            "Sure, I’m down for a quick call! Just give me a few minutes to get ready.",
            "Alright, see you in 5 minutes!!"
        ));
        sarahDialogues.put("option2", Arrays.asList(
            "I’m in Alexandria actually, right outside DC. I love going to the waterfront on weekends, especially when it’s quiet in the mornings.",
            "Definitely! There’s a place called Luna that I go to way too often. If you like to drink coffee or study in a cozy spot, it’s perfect!"
        ));
        sarahDialogues.put("option3", Arrays.asList(
            "I’m looking to get to know someone over time, through multiple dates and conversations. I’d really like to understand the other person before I think about committing to a relationship. How about you?",
            "Exactly! Talking about dates, would you like to meet up at Luna sometime?"
        ));

        List<String> sarahHobbies = Arrays.asList(
            "Farmer’s markets + trying new recipes",
            "Bouldering",
            "Reading memoirs, contemporary fiction, and the occasional trashy thriller",
            "Yoga once or twice a week — not super intense about it",
            "Knitting",
            "Going to indie concerts",
            "Road trips"
        );

        List<String> sarahOptions = Arrays.asList(
            "Hey there Sarah! I see that you’re an Epidemiologist. What exactly do you do for work?",
            "Hi, nice to meet you Sarah! Do you want to do a video call to get to know each other?",
            "Great to meet you! I see you’re located in Arlington, VA–would you mind sending a few photos of what it’s like over there>",
            "What are you looking for in a relationship?"
        );

        Profile sarahLin = new Profile("Sarah Lin", false, sarahDialogues, sarahOptions, 1, 31, sarahHobbies, "Arlington, Virginia", "Epidemiologist");

        // Sample Profile 3: Gabby Alonso (Scammer)
        Map<String, List<String>> gabbyDialogues = new HashMap<>();
        gabbyDialogues.put("option0", Arrays.asList(
            "I do a lot of different projects as a software engineer. Right now, I’m working with a client to finish a project that’s been in development for over a year.",
            "Unfortunately, I can’t release details about my current project due to confidentiality agreements. We’re working with a big client and things have been hectic lately.",
            "Generally, I work full-stack, working on both frontend and backend. I cover a wide range of responsibilities, so it’d be hard for me to go into detail."        ));
        gabbyDialogues.put("option1", Arrays.asList(
            "It would be amazing to see your face, but video calls make me anxious; could we just continue texting?",
            "I’m just nervous talking to people in general; could we maybe spend some more time chatting over the app before we take that next step?"
        ));
        gabbyDialogues.put("option2", Arrays.asList(
            "I’ve only been able to take pictures of the scenery, and I was too nervous to ask anyone to take pictures for me. Here they are: <generic pictures of Madrid, Spain>",
            "Sure, I’ll send one when I get a break. Work’s been a lot lately. I barely have time to sleep."
        ));
        gabbyDialogues.put("option3", Arrays.asList(
            "Honestly, as soon as I saw your profile, I thought that we were a perfect match! I really think we’d be great for each other; what do you think about expanding into other points of contact? I know a great encrypted app we could use.",
            "Okay, but I don’t think our relationship will progress so well on this dating app; why don’t we lock it in?"
        ));

        List<String> gabbyHobbies = Arrays.asList(
            "Baking",
            "Traveling",
            "Casual gaming",
            "Volunteering and tech community work by leading tech education programs for young girls"
        );

        List<String> gabbyOptions = Arrays.asList(
            "Hey there Gabby! I see that you’re a software engineer. What exactly do you do for work?",
                "Hi, nice to meet you Gabby! Do you want to do a video call to get to know each other?",
                "Great to meet you! I see you’re abroad in Madrid–would you mind sending a few photos of what it’s like over there?",
                "What are you looking for in a relationship?"
        );

        Profile gabbyAlonso = new Profile("Gabby Alonso", true, gabbyDialogues, gabbyOptions, 2, 25, gabbyHobbies, "Madrid, Spain", "Software Engineer");

         // Sample Profile 4: Daniel Rivera (Real Person)
        Map<String, List<String>> danielDialogues = new HashMap<>();
        danielDialogues.put("option0", Arrays.asList(
            "I work as a software developer at a mid-sized healthcare startup, specifically on backend systems. This means I work on maintaining databases and making sure our systems work correctly.",
            "I work on the backend systems for a healthcare platform, mostly using Python and Go. Lately I’ve been working on patient scheduling tools and syncing data between clinics. It's not flashy but honestly kind of rewarding knowing people actually use what we build!"
        ));
        danielDialogues.put("option1", Arrays.asList(
            "I’m usually pretty busy during the day, but I’d be happy to squeeze in a quick video call later tonight.",
            "Sounds great! See you at 8."
        ));
        danielDialogues.put("option2", Arrays.asList(
            "Seattle’s amazing if you love the outdoors. I spend a lot of weekends bouldering or hiking around Mount Si and Snoqualmie Falls.",
            "The views from up there never get old. It’s a perfect way to clear your head after a busy week.",
            "If you ever find yourself in the area, I’d be happy to show you some spots off the usual tourist track."
        ));
        danielDialogues.put("option3", Arrays.asList(
            "I’m looking for something meaningful that grows over time. I really value good conversation and getting to know someone’s quirks and all.",
            "What about you? What’s important to you in a relationship?",
            "I’m glad we have similar opinions! Talking about getting to know each other, how does a dinner date sound?"
        ));

        List<String> danielHobbies = Arrays.asList(
            "Running",
            "Trying to cook a new dish every month (currently into Thai food)",
            "Bouldering",
            "Reading — nonfiction or sci-fi mostly",
            "Watching documentaries"
        );

        List<String> danielOptions = Arrays.asList(
            "Hey there Daniel! I see that you’re a software developer at a healthcare startup! What exactly do you do for work?",
                "Hi, nice to meet you Daniel! Do you want to do a video call to get to know each other?",
                "Great to meet you! I see you’re located in Seattle–would you mind sending a few photos of what it’s like over there?",
                "What are you looking for in a relationship?"
        );

        Profile danielRivera = new Profile("Daniel Rivera", false, danielDialogues, danielOptions, 3, 34, danielHobbies, "Seattle, Washington", "Software Developer at mid-sized healthcare startup");

        // Add profiles
        profiles.put(0, michaelCarter);
        profiles.put(1, sarahLin);
        profiles.put(2, gabbyAlonso);
        profiles.put(3, danielRivera);
    }

    // Returns a profile by its ID
    public Profile getProfileById(int id) {
        if (id < 0 || id >= profiles.size()) {
            throw new IllegalArgumentException("Invalid profile ID");
        }
        return profiles.get(id);
    }

    // Returns a dialogue branch for a specific profile based on the option key,
    // which represents the dialogue initially chosen by the user
    public List<String> getDialogueBranch(int profileId, String optionKey) {
        Profile profile = getProfileById(profileId);
        return profile.getOption(optionKey);
    }

    // Returns a random profile from the list of profiles
    public Profile getRandomProfile() {
        int index = random.nextInt(profiles.size());
        return profiles.get(index);
    }

    public List<String> getUserOptions(int profileId) {
        Profile profile = getProfileById(profileId);
        return profile.getUserOptions();
    }
}

