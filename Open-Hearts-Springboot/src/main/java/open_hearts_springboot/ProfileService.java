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

        /*
         * A hashmap containing four branches of dialogue for the profile
         */
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

        // Contains a list of hobbies for the profile
        List<String> michaelHobbies = Arrays.asList(
            "Traveling",
            "Cooking (especially Italian food)",
            "Reading motivational books",
            "Going to church",
            "Long walks on the beach",
            "Philanthropy (talks about wanting to give back, start a foundation someday)",
            "Watching documentaries"
        );

        /*
         * Contains a list of user options for the initial menu only, each string 
         * represents a different dialogue branch
         */
        
        List<String> michaelOptions = Arrays.asList(
            "Hey there Michael! I see that you're an international civil engineer. What exactly do you do for work?",
            "Hi, nice to meet you Michael! Do you want to do a video call to get to know each other?",
            "Great to meet you! I see you're abroad in Turkey–would you mind sending a few photos of what it's like over there?",
            "What are you looking for in a relationship?"
        );

        /*
         * Each list holds pairs of user responses (represented by the Responses class)
         * to profile dialogue, corresponding to the numbered dialogue branches above
         */
        List<Responses> michaelResponses0 = Arrays.asList(
            new Responses(
                "Wow, sounds awesome! What exactly are you doing in the project? Is it a public project you’d be willing to share more details on?",
                "That sounds great, but a little vague. What’s your role in this project?"
            ),
            new Responses(
                "That does sound really stressful, any way I could help?",
                "Oh no, what's wrong?"
            ),
            new Responses(
                "What’s going on? Are you okay?",
                "That sounds serious. What happened?"
            ),
            new Responses(
                "Umm…I don’t think I’m comfortable with sending money to a stranger",
                "I don’t think so…"
            )
        );

        List<Responses> michaelResponses1 = Arrays.asList(
            new Responses(
                "That’s alright. Even with a bad connection, it would still be nice to see each other.",
                "Totally get it. Maybe just an audio call then?"
            )
        );

        List<Responses> michaelResponses2 = Arrays.asList(
            new Responses(
                "Even just one would be cool. I’ve always wanted to see Turkey.",
                "Could you send a selfie too? Just curious who I’m talking to."
            )
        );

        List<Responses> michaelResponses3 = Arrays.asList(
            new Responses(
                "I’m not sure if we should be rushing into things, we’ve barely even talked!",
                "I think we should take more time to get to know each other."
            )
        );

        // Groups all the response lists into one list of lists
        List<List<Responses>> michaelResponsesAll = Arrays.asList(
            michaelResponses0,
            michaelResponses1,
            michaelResponses2,
            michaelResponses3
        );

        // Create text for the success and failure ending screens
        String michaelEnding = 
            "First, he displayed inconsistent or vague personal details when he avoided going into detail about his work or share photos. " + 
            "Second, Michael made urgent requests for money or financial help. Although this would typically happen later in the relationship in a real-life situation, be sure to keep an eye out. " +
            "Third, he displayed avoidance of in-person meets or video calls by claiming a bad signal. " +
            "Finally, he made rapid and intense declarations of love, claiming he felt 'an instant connection' with you. ";
            
        // Initializes the profile for Michael Carter
        Profile michaelCarter = new Profile("Michael Carter", true, michaelDialogues, michaelOptions, michaelEnding, michaelResponsesAll, 0, 46, michaelHobbies, "Houston, Texas", "International Civil Engineer");

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

        List<Responses> sarahResponses0 = Arrays.asList(
            new Responses(
                "Very cool! What’s your role in all of that?",
                "That sounds really interesting! What kind of programs are you working on right now?"
            )
        );

        List<Responses> sarahResponses1 = Arrays.asList(
            new Responses(
                "Sure thing!",
                "Sounds good!"
            )
        );

        List<Responses> sarahResponses2 = Arrays.asList(
            new Responses(
                "That sounds really nice. Any favorite coffee shops?",
                "I’ve been meaning to explore that area more. Any recommendations?"
            )
        );

        List<Responses> sarahResponses3 = Arrays.asList(
            new Responses(
                "That sounds similar to what I’m looking for!",
                "That makes sense, it’s good to know the other person really well and not rush into a relationship."
            ),
            new Responses(
                "Yes, that sounds great! When are you free?",
                "That sounds amazing! Let’s discuss a date and time."
            )
        );

        List<List<Responses>> sarahResponsesAll = Arrays.asList(
            sarahResponses0,
            sarahResponses1,
            sarahResponses2,
            sarahResponses3
        );

        // Create text for the success and failure ending screens
        String sarahEnding = 
            "First, she was able to explain her work and hobbies in detail without being too vague. " + 
            "Second, she was open to making a video call, not avoiding face-to-face interactions. " +
            "Third, she stated that she did not want to rush the relationship, instead preferring to get to know you better. " +
            "Finally, Sarah did not make any attempt to move off-platform or have you send money. " +
            "Sarah is not a scammer, but make sure to be careful on online dating platforms; scammers may not display their true nature early on.";

        Profile sarahLin = new Profile("Sarah Lin", false, sarahDialogues, sarahOptions, sarahEnding, sarahResponsesAll, 1, 31, sarahHobbies, "Arlington, Virginia", "Epidemiologist");

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

        List<Responses> gabbyResponses0 = Arrays.asList(
            new Responses(
                "Wow, sounds awesome! What exactly are you doing in the project? Is it a public project you’d be willing to share more details on?",
                "That sounds great, but a little vague. What’s your role in this project?"
            ),
            new Responses(
                "That makes sense, but what does your day-to-day look like?",
                "Sure, but are there any released or open projects you could talk about?"
            ),
            new Responses(
                "I see.",
                "Hmm, okay."
            )
        );

        List<Responses> gabbyResponses1 = Arrays.asList(
            new Responses(
                "I understand. Could we at least do a voice call?",
                "Totally get it. Maybe just an audio call then?"
            )
        );

        List<Responses> gabbyResponses2 = Arrays.asList(
            new Responses(
                "That’s unfortunate, landscape pictures are cool but it’d be a lot more interesting to see you in the pictures too!",
                "Could you send a selfie too? Just curious who I’m talking to."
            )
        );

        List<Responses> gabbyResponses3 = Arrays.asList(
            new Responses(
                "I’m not sure if we should be rushing into things, we’ve barely even talked! Let’s keep conversations on this app for now.",
                "I think we should take more time to get to know each other."
            )
        );

        List<List<Responses>> gabbyResponsesAll = Arrays.asList(
            gabbyResponses0,
            gabbyResponses1,
            gabbyResponses2,
            gabbyResponses3
        );

        // Create text for the success and failure ending screens
        String gabbyEnding = 
            "First, she displayed inconsistent or vague personal details when she avoided going into detail about her work and shared generic pictures of Madrid found on the Internet. " + 
            "Second, she displayed avoidance of in-person meets or video calls by sharing that she feels anxious about video calls." +
            "Third, Gabby displayed rapid and intense declarations of love when she emphasized that you and her would be a great match without talking for a long time. " +
            "Finally, she made attempts to move off-platform, claiming she knows a 'great encrypted app'. ";

        Profile gabbyAlonso = new Profile("Gabby Alonso", true, gabbyDialogues, gabbyOptions, gabbyEnding, gabbyResponsesAll, 2, 25, gabbyHobbies, "Madrid, Spain", "Software Engineer");

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

        List<Responses> danielResponses0 = Arrays.asList(
            new Responses(
                "Very cool! What’s your role in all of that?",
                "That sounds really interesting! What kind of programs are you working on right now?"
            )
        );

        List<Responses> danielResponses1 = Arrays.asList(
            new Responses(
                "That works for me!",
                "Same here, how does 8pm sound?"
            )
        );

        List<Responses> danielResponses2 = Arrays.asList(
            new Responses(
                "That sounds awesome! I love hiking too.",
                "I’ve never been to Washington! What’s it like to hike there?"
            ),
            new Responses(
                "Sounds like a perfect way to spend your weekend!",
                "Wow, this is making me want to visit!"
            )
        );

        List<Responses> danielResponses3 = Arrays.asList(
            new Responses(
                "That sounds similar to what I’m looking for!",
                "That makes sense, it’s good to know the other person really well and not rush into a relationship."
            ),
            new Responses(
               "I agree with you, I want to get to know someone pretty well before I get into a relationship.",
               "We seem to have similar views! I don’t like to rush into things, I’d rather take the time to understand someone before getting into a relationship."
            ),
            new Responses(
                "That sounds amazing! Let’s talk more about the place and a good time.",
                "I’d love the chance to meet you in person!"
            )
        );

        List<List<Responses>> danielResponsesAll = Arrays.asList(
            danielResponses0,
            danielResponses1,
            danielResponses2,
            danielResponses3
        );

        // Create text for the success and failure ending screens
        String danielEnding = 
            "First, he was able to explain his work and hobbies in detail without being too vague. " + 
            "Second, he was open to making a video call, not avoiding face-to-face interactions. " +
            "Third, he stated that he did not want to rush the relationship, instead preferring something meaningful that grows over time. " +
            "Finally, Daniel did not make any attempt to move off-platform or have you send money. " +
            "Daniel is not a scammer, but make sure to be careful on online dating platforms; scammers may not display their true nature early on.";

        Profile danielRivera = new Profile("Daniel Rivera", false, danielDialogues, danielOptions, danielEnding, danielResponsesAll, 3, 34, danielHobbies, "Seattle, Washington", "Software Developer at mid-sized healthcare startup");

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

    // Returns the full list of profile-specific user options for the initial menu
    public List<String> getUserOptions(int profileId) {
        Profile profile = getProfileById(profileId);
        return profile.getUserOptions();
    }

    // Returns all lists containing pairs of user responses to profile dialogue
    public List<List<Responses>> getUserResponses(int profileId) {
        Profile profile = getProfileById(profileId);
        return profile.getUserResponses();
    }   

    // Returns ending screen text for the profile
    public String getEnding(int profileId) {
        Profile profile = getProfileById(profileId);
        return profile.getEnding();
    }
}

