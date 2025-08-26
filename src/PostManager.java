import java.util.*;

public class PostManager {

    
    public int calculateEngagement(int... interactions) {
        if (interactions == null || interactions.length == 0) return 0;
        int total = 0;
        for (int interaction : interactions) {
            total += interaction;
        }
        return total;
    }

 
    public String getCategoryRating(int engagementScore) {
        if (engagementScore >= 1000) return "Viral";
        else if (engagementScore >= 500) return "Popular";
        else if (engagementScore >= 100) return "Good";
        else if (engagementScore >= 50) return "Low";
        else return "Poor";
    }


    public void displayPostStats(String postTitle, int engagementScore) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
    }

  
    public void displayPostStats(String postTitle, int engagementScore, String category) {
        System.out.println("Post: " + postTitle);
        System.out.println("Engagement Score: " + engagementScore);
        System.out.println("Category: " + category);
    }


    public ArrayList<String> manageHashtags(String[] hashtags) {
        if (hashtags == null) hashtags = new String[0];
        HashSet<String> uniqueSet = new HashSet<>();
        int limit = Math.min(5, hashtags.length);
        for (int i = 0; i < limit; i++) {
            if (hashtags[i] != null) {
                uniqueSet.add(hashtags[i]);
            }
        }
        return new ArrayList<>(uniqueSet);
    }

  
    public LinkedList<String> findTrendingPosts(ArrayList<String> posts, HashMap<String, Integer> postEngagement) {
        LinkedList<String> trending = new LinkedList<>();
        if (posts == null || postEngagement == null) return trending;
        for (String post : posts) {
            Integer score = postEngagement.get(post);
            if (score != null && score > 500) {
                trending.add(post);
            }
        }
        return trending;
    }

   
    public HashSet<String> getUniqueAuthors(String... authors) {
        HashSet<String> uniqueAuthors = new HashSet<>();
        if (authors != null) {
            for (String author : authors) {
                if (author != null) uniqueAuthors.add(author);
            }
        }
        return uniqueAuthors;
    }

    public static void main(String[] args) {
        PostManager pm = new PostManager();

  
        String postTitle = "Java Programming Tips";
        int engagement = pm.calculateEngagement(150, 75, 25);
        String category = pm.getCategoryRating(engagement);

    
        String[] hashtagsArr = {"#java", "#coding", "#programming", "#java", "#tips"};
        ArrayList<String> uniqueHashtags = pm.manageHashtags(hashtagsArr);

       
        ArrayList<String> posts = new ArrayList<>(Arrays.asList("Java Programming Tips", "Advanced Java Tutorial", "Spring Boot Guide"));
        HashMap<String, Integer> postEngagement = new HashMap<>();
        postEngagement.put("Java Programming Tips", engagement);
        postEngagement.put("Advanced Java Tutorial", 650);
        postEngagement.put("Spring Boot Guide", 1400);
        LinkedList<String> trending = pm.findTrendingPosts(posts, postEngagement);

  
        HashSet<String> uniqueAuthors = pm.getUniqueAuthors("Alice", "Bob", "Alice", "Charlie", "Bob");


        System.out.println("≡ Social Media Post Manager ≡");
        pm.displayPostStats(postTitle, engagement, category);
        System.out.println();
        System.out.println("Unique Hashtags: " + uniqueHashtags);
        System.out.println("Trending Posts: " + trending);
        System.out.println("Unique Authors: " + uniqueAuthors);
    }
}
