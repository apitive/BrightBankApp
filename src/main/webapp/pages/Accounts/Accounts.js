/*
 * Use App.getDependency for Dependency Injection
 * eg: var DialogService = App.getDependency('DialogService');
 */

/* perform any action on widgets/variables within this block */
Page.onReady = function() {
    /*
     * variables can be accessed through 'Page.Variables' property here
     * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
     * Page.Variables.loggedInUser.getData()
     *
     * widgets can be accessed through 'Page.Widgets' property here
     * e.g. to get value of text widget named 'username' use following script
     * 'Page.Widgets.username.datavalue'
     */
};

Page.getNameInitials = function(fullName, anchorEle) {
    return fullName[0] + fullName[1];
};

// Page.label16Currency = function(Currency) {

//     return currency == 'GBP' ? '£' : currency == 'USD' ? '$' : '€';

// }


Page.label11Currency = function(currency, type) {

    return currency + " " + type[0] + type[1] + type[2] + " acc"

}
