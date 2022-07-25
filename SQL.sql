CREATE TABLE Theater (
    theaterID INT NOT NULL,
    theaterName VARCHAR(50) NOT NULL,
    zipCode CHAR(5),
    CONSTRAINT pkTheater PRIMARY KEY (theaterID);
)

CREATE TABLE Movie (
    movieID INT NOT NULL,
    title VARCHAR(50) NOT NULL,
    movieTime VARCHAR(5) NOT NULL,
    movieDuration INT NOT NULL,
    
    theaterID INT NOT NULL, --Used to reference Theater table
    
    movieDescription VARCHAR(500) NOT NULL,
    CONSTRAINT pkMovieID PRIMARY KEY (movieID),
    CONSTRAINT fkTheaterID FOREIGN KEY (theaterID) REFERENCES Theater(theaterID);
)

INSERT INTO Theater (theaterID, theaterName, zipCode)
VALUES  (001, 'IMAX', '75080'), 
        (002, 'Cinemark', '75023'), 
        (003, 'Movie Tavern', '75034'),
        (004, 'Studio Movie Grill', '75080'), 
        (005, 'Landmark', '75023'), 
        (006, 'Granada', '75034'),
        (007, 'Alamo Drafthouse', '75080'), 
        (008, 'Starplex', '75023'), 
        (009, 'Premiere Cinema', '75034');

INSERT INTO Movie (movieID, title, movieTime, movieDuration, theaterID, movieDescription)
VALUES  (001, 'The Shawshank Redemption', '10AM', 142, 001, 'Framed in the 1940s for the double murder of his wife and her lover, 
        upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral 
        warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red 
        -- for his integrity and unquenchable sense of hope.'),
        
        (002, 'The Godfather', '11AM', 175, 001, 'The story spans the years from 1945 to 1955 and chronicles the fictional Italian-American 
        Corleone crime family. When organized crime family patriarch Vito Corleone barely survives an attempt on his life, his youngest son, 
        Michael, steps in to take care of the would-be killers, launching a campaign of bloody revenge.'),
        
        (003, 'The Godfather: Part 2', '12PM', 200, 001, 'The continuing saga of the Corleone crime family tells the story of a young Vito Corleone 
        growing up in Sicily and in 1910s New York; and follows Michael Corleone in the 1950s as he attempts to expand the family business into 
        Las Vegas, Hollywood and Cuba.'),
        
        (004, 'The Dark Knight', '1PM', 152, 002, 'Batman raises the stakes in his war on crime. With the help of Lt. Jim Gordon and District Attorney 
        Harvey Dent, Batman sets out to dismantle the remaining criminal organizations that plague the streets. The partnership proves to be effective, 
        but they soon find themselves prey to a reign of chaos unleashed by a rising criminal mastermind known to the terrified citizens of Gotham as 
        the Joker.'),
        
        (005, 'Schindlers List', '2PM', 195, 002, 'Told from the perspective of businessman Oskar Schindler who saved over a thousand Jewish lives from the 
        Nazis while they worked as slaves in his factory. Schindlers List is based on a true story, illustrated in black and white and controversially 
        filmed in many original locations.'),
        
        (006, '12 Angry Men', '3PM', 96, 002, '12 Angry Men is the 1957 film debut for director Sidney Lumet. An interpretion from a Broadway show, this film 
        is about 12 jurors who must decide whether an 18-year-old is guilty of killing his father.'),
        
        (007, 'Pulp Fiction', '4PM', 148, 003, 'Pulp Fiction is a cult film by Director Quentin Tarantino with three interwoven plots with lots of violence, 
        absurdity, and great music. The film is Tarantinos most famous and the film that cemented his name and style in Hollywood.'),
        
        (008, 'LOTR: Return of the King', '5PM', 201, 003, 'Aragorn is revealed as the heir to the ancient kings as he, Gandalf and the other members of the 
        broken fellowship struggle to save Gondor from Saurons forces. Meanwhile, Frodo and Sam bring the ring closer to the heart of Mordor, the dark 
        lords realm.')
        
        (009, 'The Good, the Bad and the Ugly', '6PM', 161, 003, 'A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find 
        a fortune in gold buried in a remote cemetery.This is the third Italian-Western film of a trilogy from director Sergio Leone who gives Western 
        films a new (bloody) color.')
        
        (010, 'Fight Club', '7PM', 148, 004, 'A ticking-time-bomb insomniac and a slippery soap salesman channel primal male aggression into a shocking new 
        form of therapy. Their concept catches on, with underground "fight clubs" forming in every town, until an eccentric gets in the way and ignites 
        an out-of-control spiral toward oblivion.')
        
        (011, 'LOTR: The Fellowship of the Ring', '8PM', 200, 004, 'Young hobbit Frodo Baggins, after inheriting a mysterious ring from his uncle Bilbo, must 
        leave his home in order to keep it from falling into the hands of its evil creator. Along the way, a fellowship is formed to protect the ringbearer 
        and make sure that the ring arrives at its final destination: Mt. Doom, the only place where it can be destroyed.')
        
        (012, 'Star Wars: Episode V', '9PM', 130, 004, 'The epic saga continues as Luke Skywalker, in hopes of defeating the evil Galactic Empire, learns the ways 
        of the Jedi from aging master Yoda. But Darth Vader is more determined than ever to capture Luke. Meanwhile, rebel leader Princess Leia, cocky Han Solo, 
        Chewbacca, and droids C-3PO and R2-D2 are thrown into various stages of capture, betrayal and despair.')
        
        (013, 'Forrest Gump', '10PM', 142, 005, 'A man with a low IQ has accomplished great things in his life and been present during significant historic events - 
        in each case, far exceeding what anyone imagined he could do. Yet, despite all the things he has attained, his one true love eludes him. "Forrest Gump" 
        is the story of a man who rose above his challenges, and who proved that determination, courage, and love are more important than ability.'),

        (014, 'Inception', '11PM', 148, 005, 'Cobb, a skilled thief who commits corporate espionage by infiltrating the subconscious of his targets is offered a chance 
        to regain his old life as payment for a task considered to be impossible: "inception", the implantation of another persons idea into a targets subconscious.'),

        (015, 'LOTR: The Two Towers', '12AM', 179, 005, 'Frodo and Sam are trekking to Mordor to destroy the One Ring of Power while Gimli, Legolas and Aragorn search for the 
        orc-captured Merry and Pippin. All along, nefarious wizard Saruman awaits the Fellowship members at the Orthanc Tower in Isengard.'),

        (016, 'One Flew Over The Cuckoos Nest', '9AM', 133, 006, 'While serving time for insanity at a state mental hospital, implacable rabble-rouser Randle Patrick McMurphy 
        inspires his fellow patients to rebel against the authoritarian rule of head nurse Mildred Ratched.'),

        (017, 'Goodfellas', '10AM', 146, 006, 'Henry Hill is a small time gangster, who takes part in a robbery with Jimmy Conway and Tommy De Vito, two other gangsters who have set their sights 
        a bit higher. His two partners kill off everyone else involved in the robbery, and slowly start to climb up through the hierarchy of the Mob. Henry, however, 
        is badly affected by his partners success, but will he stoop low enough to bring about the downfall of Jimmy and Tommy?'),

        (018, 'The Matrix', '11AM', 136, 006, 'A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.'),

        (019, 'Seven Samurai', '12PM', 207, 007, 'A veteran samurai, who has fallen on hard times, answers a villages request for protection from bandits. He gathers 6 other samurai 
        to help him, and they teach the townspeople how to defend themselves, and they supply the samurai with three small meals a day. The film culminates in a giant 
        battle when 40 bandits attack the village.'),

        (020, 'Star Wars: Episode IV', '1PM', 121, 007, 'Princess Leia is captured and held hostage by the evil Imperial forces in their effort to take over the galactic Empire. 
        Venturesome Luke Skywalker and dashing captain Han Solo team together with the loveable robot duo R2-D2 and C-3PO to rescue the beautiful princess and restore 
        peace and justice in the Empire.'),

        (021, 'City of God', '2PM', 130, 007, 'City of God is one of the most successful Brazilian films of all times. It depicts the raw violence in the ghettos of Rio de Janeiro 
        in the 1970s that even had young kids carrying guns and joining gangs when they should be playing hide-and-seek.'),

        (022, 'Se7en', '3PM', 127, 008 'Two homicide detectives are on a desperate hunt for a serial killer whose crimes are based on the "seven deadly sins" in this dark and haunting 
        film that takes viewers from the tortured remains of one victim to the next. The seasoned Det. Sommerset researches each sin in an effort to get inside the killers 
        mind, while his novice partner, Mills, scoffs at his efforts to unravel the case.'),

        (023, 'The Silence of the Lambs', '4PM', 118, 008, 'FBI trainee Clarice Starling ventures into a maximum-security asylum to pick the diseased brain of Hannibal Lecter, a psychiatrist 
        turned homicidal cannibal. Starling needs clues to help her capture a serial killer. Unfortunately, her Faustian relationship with Lecter soon leads to his escape, and now 
        two deranged killers are on the loose.'),

        (024, 'Its a Wonderful Life', '5PM', 130, 008, 'An angel helps a compassionate but despairingly frustrated businessman by showing what life would had been like if he never existed.'),

        (025, 'The Usual Suspects', '6PM', 106, 009, 'A boat has been destroyed, criminals are dead, and the key to this mystery lies with the only survivor and his twisted, convoluted story 
        beginning with five career crooks in a seemingly random police lineup.'),

        (026, 'Life Is Beautiful', '7PM', 116, 009, 'A touching story of an Italian book seller of Jewish ancestry who lives in his own little fairy tale. His creative and happy life would come 
        to an abrupt halt when his entire family is deported to a concentration camp during World War II. While locked up he tries to convince his son that the whole thing is just a 
        game.'),

        (027, 'Leon: The Professional', '8PM', 110, 009, 'Léon, the top hit man in New York, has earned a rep as an effective "cleaner." But when his next-door neighbors are wiped out by a loose-cannon 
        DEA agent, he becomes the unwilling custodian of 12-year-old Mathilda. Before long, Mathildas thoughts turn to revenge, and she considers following in Léons footsteps.');
        