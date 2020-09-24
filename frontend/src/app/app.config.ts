export default {
  oidc: {
    clientId: `0oa11s3u2oVAYKMB44x7`,
    issuer: `https://dev-708628.okta.com/oauth2/default/`,
    redirectUri: 'http://localhost:8080/login/callback',
    scopes: ['openid', 'profile', 'email'],
    pkce: true,
    testing: {
      disableHttpsCheck: `true`
    }
  },
  resourceServer: {
    messagesUrl: 'http://localhost:8000/api/messages',
  },
};
