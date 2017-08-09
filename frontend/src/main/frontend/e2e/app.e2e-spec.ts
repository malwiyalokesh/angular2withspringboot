import { Angular2springbootPage } from './app.po';

describe('angular2springboot App', () => {
  let page: Angular2springbootPage;

  beforeEach(() => {
    page = new Angular2springbootPage();
  });

  it('should display welcome message', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('Welcome to app!');
  });
});
