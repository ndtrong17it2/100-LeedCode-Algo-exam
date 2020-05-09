class UniqueEmailAddresses929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> list = new HashSet<String>();
        for(String mail: emails){
            String localName = mail.substring(0, mail.indexOf("@"));
            String domain = mail.substring(mail.indexOf("@"));
            localName = localName.split("\\+")[0];
            localName = String.join("", localName.split("\\."));
            list.add(localName.concat(domain));
        }
        return list.size();
    }
}