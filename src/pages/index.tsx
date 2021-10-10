import type { NextPage } from 'next';
import SafeEnvironment from 'ui/components/feedback/SafeEnvironment/SafeEnvironment';
import PageTitle from 'ui/components/data-display/PageTitle/PageTitle';
import UserInformation from 'ui/components/data-display/UserInformation/UserInformation';
const Home: NextPage = () => {
  return (
    <div>
        <SafeEnvironment />
        <PageTitle 
        title={'Conheça os Profissionais'}
        subtitle={'preencha seu endereço e veja todos os profissionais da sua localidade'} 
      />
      
      <UserInformation
        name={ 'Geovane Santos' }
        picture={ 'https://github.com/GE-SANTOS.png' }
        rating={ 5 }
        description={'Salvador'}
      />

    </div>
  );
}

export default Home


